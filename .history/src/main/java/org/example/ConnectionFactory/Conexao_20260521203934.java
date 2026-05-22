package org.example.ConnectionFactory;

import java.sql.DriverManager;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/TRANSPORTADORA?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String SENHA = "mysqlTrans";

    public static Connection Conexao() 
    {
        return DriverManager.
    }
}