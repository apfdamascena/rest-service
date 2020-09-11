package com.rest.service.restservice.database;

import java.sql.*;

public class Driver {

    private Connection connection;
    private Statement statement;
    private String url = "jdbc:mysql://localhost:3306/Market";
    private String user = "studying";
    private String password = "!!Market9999";

    public Driver(){
        try {
            this.connection = DriverManager.getConnection(url, user, password);
            this.statement = this.connection.createStatement();
        } catch (Exception execution) {
            execution.printStackTrace();
        }
    }

    public ResultSet tryToGetResult(String whatDoIHaveToDo) throws SQLException{
        return this.statement.executeQuery(whatDoIHaveToDo);
    }
}
