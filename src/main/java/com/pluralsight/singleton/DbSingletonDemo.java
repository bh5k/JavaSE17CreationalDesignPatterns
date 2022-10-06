package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main (String [] args) throws SQLException {
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        Connection conn = instance.getConnection();

        Statement statement = conn.createStatement();

        statement.execute("Create table students (ID int primary key, name varchar(65))");

        System.out.println("Create table students.");

        int rows = statement.executeUpdate("Insert into students (ID, name) values (1, 'Bryan')");

        if(rows > 0) {
            System.out.println("Inserted a new row.");
        }
         conn.close();
    }

}
