package database;

import utils.ConfigFileReader;

import java.sql.*;

public class DWH {
    ConfigFileReader configFileReader;

    public Statement database_connection() throws Exception {
        configFileReader = new ConfigFileReader();
        String connectionString = configFileReader.getConfigValue("connectionString");
        String username = configFileReader.getConfigValue("databaseUserName");
        String password = configFileReader.getConfigValue("databasePassword");
        Class.forName(configFileReader.getConfigValue("Class.forName"));
        //The getConnection() method of DriverManager class is used to establish connection with the database
        Connection connection = DriverManager.getConnection(connectionString, username, password);
        return connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }
}

