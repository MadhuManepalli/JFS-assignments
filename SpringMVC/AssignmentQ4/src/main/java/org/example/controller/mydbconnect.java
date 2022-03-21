package org.example.controller;

import java.sql.*;
 
public class mydbconnect {
 
public static void main(String[] args) {
   try {
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springmvc4", "root", "madhu");//Establishing connection
System.out.println("Connected With the database successfully");
//Creating PreparedStatement object
PreparedStatement preparedStatement=connection.prepareStatement("insert into users values(?,?,?,?)");
//Setting values for Each Parameter
preparedStatement.setString(1,"101");
         preparedStatement.setString(2,"madhu");
         preparedStatement.setString(3, "madhu");
         preparedStatement.setString(4, "madhu@gmail.com");
        
         //Executing Query
         preparedStatement.executeUpdate();
         System.out.println("data inserted successfully");
} catch (SQLException e) {
System.out.println("Error while connecting to the database");
}
}
}
 

