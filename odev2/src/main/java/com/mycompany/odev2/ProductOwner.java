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
 * Bu sınıf, ProductOwner sınıfını temsil eder. Bir Scrum ekibinin üyesi olarak, 
 * ürün sahibi (product owner) rolünü üstlenir ve Product Backlog'a yeni görevler ekler.
 * 
 * Not: Bu sınıf, TeamMember sınıfından türetilmiştir ve Scrum ekibindeki ürün sahibini temsil eder.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.Random;
import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductOwner extends TeamMember {

    private String url = "jdbc:mysql://localhost:3306/yazm457hw2";
    private String username = "root";
    private String password = "";

    public ProductOwner(int teamSize, int sprintCount) {
        super(teamSize, "ProductOwner", sprintCount);
    }

    @Override
    public void operate() {
        System.out.println("Connecting database ...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");

            // Veri tabanındaki product_backlog tablosuna (teamSize-2) kadar yeni task ekler
            // Böylece her geliştiriciye bir task düşer, geliştiriciler bunları rastgele seçebilir

            for (int i = 0; i < teamSize - 2; i++) {
                Task task = Task.generateTask(i + 1);
                insertTaskToProductBacklog(connection, task);
            }

            connection.close();
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
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

    private void insertTaskToProductBacklog(Connection connection, Task task) {
        String insertQuery = "INSERT INTO product_backlog (taskname, backlogId, priority) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, task.name);
            preparedStatement.setInt(2, task.backlogId);
            preparedStatement.setInt(3, task.priority);

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new IllegalStateException("Error inserting task to Product Backlog!");
            }

            // GeneratedKeys kullanılmıyor, çünkü product_backlog'taki taskId otomatik artan bir değerdir.
        } catch (SQLException e) {
            throw new IllegalStateException("Error inserting task to Product Backlog!", e);
        }
    }
}
