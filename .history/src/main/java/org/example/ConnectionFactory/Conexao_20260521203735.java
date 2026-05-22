package org.example.ConnectionFactory;

import java.sql.DriverManager;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/nomedobanco?useSSL=false&serverTimezone=UTC";
    private final String USER = "root";
    private final String PASSWORD = "mysqlTrans";

    public static void Conexao() 
    {
        
    }
}