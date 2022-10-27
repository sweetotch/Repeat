package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBWorker extends Main { //DBWorker - класс создающий соединение между проэктом java и базой даных SQL

    //данные для подключения к локальной базе данных
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";   //"jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=FALSE&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1111";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DBWorker() {
        //реализация подключения к базе данных
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            new Execute(connection).execute();



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

