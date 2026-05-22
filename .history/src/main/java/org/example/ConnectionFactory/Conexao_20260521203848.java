package org.example.ConnectionFactory;

import java.sql.DriverManager;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/TRANSPORTADORA?useSSL=false&serverTimezone=UTC";
    private final final String USER = "root";
    private final final String PASSWORD = "mysqlTrans";

    public static Connection Conexao() 
    {
        return DriverManager.getConnection(URL, URL, URL)
    }
}