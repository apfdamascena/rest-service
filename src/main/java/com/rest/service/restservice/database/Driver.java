package com.rest.service.restservice.database;

import java.sql.*;

public class Driver {

    public static void main(String[] args){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Market", "studying", "!!Market9999");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select * from Product");

            while(result.next()){
                System.out.println(result.getString("name"));
            }
        } catch (Exception execution){
            execution.printStackTrace();
        }
    }
    
}
