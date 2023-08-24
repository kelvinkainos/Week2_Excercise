package org.kainos.ea.db;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DatabaseConnector {
    public  Connection conn;

    public Connection getConnection() throws SQLException {
        String user, password, host, name;

        if (conn != null && !conn.isClosed()) { return conn; }

        try (FileInputStream propsStream = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(propsStream);

            user = props.getProperty("user");
            password = props.getProperty("password");
            host = props.getProperty("host");
            name = props.getProperty("name");

            if (user == null || password == null || host == null)
                throw new IllegalArgumentException("Properties file must exist " +
                        "and must contain user, password and host properties.");

            conn = DriverManager.getConnection("jdbc:mysql://" + host + "/" + name + "?useSSL=false", user, password);
            return conn;
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        return null;
    }
}
