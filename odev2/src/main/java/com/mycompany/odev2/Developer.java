/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev2;

/**
 *
 * @author Excalibur
 */

import com.mycompany.odev2.ProductOwner.Task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

/*
 * Bu sınıf, Developer tipindeki bir takım üyesini temsil eder ve veritabanı işlemleri üzerinde çalışır.
 */

     // Constructor - Takım boyutu, thread adı ve sprint sayısı parametre olarak alınır.
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Developer extends TeamMember {

    private String url = "jdbc:mysql://localhost:3307/yazm457hw2";
    private String username = "root";
    private String password = "";

    public Developer(int teamSize, String threadName, int sprintCount) {
        super(teamSize, threadName, sprintCount);
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.sprintCount; i++) {
            System.out.println(threadName + " (sprint" + i + ")");
            try {
                operate();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " bitti...");
    }

    @Override
public void operate() {
    // Veri tabanındaki sprint_backlog tablosundan bir görev alınarak tamamlanacak.
    // Tamamlanan görev veri tabanındaki board tablosuna yazılacak.

    Connection connection = null;
    try {
        connection = DriverManager.getConnection(url, username, password);
        List<Task> sprintBacklogTasks = getSprintBacklogTasks(connection);

        if (!sprintBacklogTasks.isEmpty()) {
            Task selectedTask = sprintBacklogTasks.get(0);
            insertTaskToBoard(connection, selectedTask);
        }
    } catch (SQLException e) {
        throw new IllegalStateException("Error connecting to the database!", e);
    } finally {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

    private List<Task> getSprintBacklogTasks(Connection connection) {
        List<Task> tasks = new ArrayList<>();
        String selectQuery = "SELECT * FROM sprint_backlog WHERE sprintId = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setInt(1, sprintCount);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String taskName = resultSet.getString("taskname");
                    int backlogId = resultSet.getInt("backlogId");
                    int priority = resultSet.getInt("priority");

                    tasks.add(new Task(0,taskName, backlogId, priority));
                }
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Error retrieving tasks from Sprint Backlog!", e);
        }

        return tasks;
    }

    private void insertTaskToBoard(Connection connection, Task task) {
    String insertQuery = "INSERT INTO board (taskId, taskname, backlogId, sprintId, developerName, priority) VALUES (?, ?, ?, ?, ?, ?)";

    try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
        preparedStatement.setInt(1, task.taskId);
        preparedStatement.setString(2, task.name);
        preparedStatement.setInt(3, task.backlogId);
        preparedStatement.setInt(4, sprintCount);
        preparedStatement.setString(5, threadName);
        preparedStatement.setInt(6, task.priority);

        int affectedRows = preparedStatement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Creating task failed, no rows affected.");
        }

        System.out.println(threadName + " Added task to Board: " + task);
    } catch (SQLException e) {
        throw new IllegalStateException("Error inserting task to Board!", e);
    }
}
}
