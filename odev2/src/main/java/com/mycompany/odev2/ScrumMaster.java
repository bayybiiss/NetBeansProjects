/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev2;

/**
 *
 * @author Excalibur
 */

/*
 * Bu sınıf, ScrumMaster sınıfını temsil eder. Scrum ekibinin bir üyesi olarak,
 * ScrumMaster rolünü üstlenir ve Sprint Backlog'a görev ekler.
 * 
 * Not: Bu sınıf, TeamMember sınıfından türetilmiştir ve Scrum ekibindeki ScrumMaster'ı temsil eder.
 */

import com.mycompany.odev2.ProductOwner.Task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.Random;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScrumMaster extends TeamMember {

    private String url = "jdbc:mysql://localhost:3307/yazm457hw2";
    private String username = "root";
    private String password = "";

    public ScrumMaster(int teamSize, int sprintCount) {
        super(teamSize, "ScrumMaster", sprintCount);
    }

    @Override
    public void operate() {
        System.out.println("Connecting database ...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");

            // Veri tabanında yer alan sprint_backlog tablosuna (teamSize-2) kadar yeni task ekler
            // Bunları product_backlog içerisinden alıp, sprint_backlog'a getirir 
            // Buradaki görevler de geliştiriciler tarafından rastgele seçilir.

            List<Task> productBacklogTasks = getProductBacklogTasks(connection);

            for (int i = 0; i < teamSize - 2 && i < productBacklogTasks.size(); i++) {
                Task selectedTask = productBacklogTasks.get(i);
                insertTaskToSprintBacklog(connection, selectedTask);
            }

            System.out.println("Tasks added to Sprint Backlog!");

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the database!", e);
        }
    }

    private List<Task> getProductBacklogTasks(Connection connection) {
    List<Task> tasks = new ArrayList<>();
    String selectQuery = "SELECT * FROM product_backlog";

    try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
         ResultSet resultSet = preparedStatement.executeQuery()) {

        while (resultSet.next()) {
            String taskName = resultSet.getString("taskname");
            int backlogId = resultSet.getInt("backlogId");
            int priority = resultSet.getInt("priority");

            tasks.add(new Task(0, taskName, backlogId, priority)); // taskId'yi 0 olarak atayalım
        }

    } catch (SQLException e) {
        throw new IllegalStateException("Error retrieving tasks from Product Backlog!", e);
    }

    return tasks;
}

    private void insertTaskToSprintBacklog(Connection connection, Task task) {
    String insertQuery = "INSERT INTO sprint_backlog (taskId, taskname, backlogId, sprintId, priority) VALUES (?, ?, ?, ?, ?)";

    try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
        preparedStatement.setInt(1, task.taskId); // taskId'yi burada atayalım
        preparedStatement.setString(2, task.name);
        preparedStatement.setInt(3, task.backlogId);
        preparedStatement.setInt(4, sprintCount); // sprintId'yi bu şekilde belirtin
        preparedStatement.setInt(5, task.priority);

        int affectedRows = preparedStatement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Creating task failed, no rows affected.");
        }

        System.out.println(threadName + " Added task to Sprint Backlog: " + task);
    } catch (SQLException e) {
        throw new IllegalStateException("Error inserting task to Sprint Backlog!", e);
    }
}

    @Override
    public void run() {
        for (int i = 1; i <= sprintCount; i++) {
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
}
