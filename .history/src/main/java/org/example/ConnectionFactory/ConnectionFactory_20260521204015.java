package org.example.ConnectionFactory;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://localhost:3306/TRANSPORTADORA?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String SENHA = "mysqlTrans";

    public static Connection Conexao() throws SQLException
    {
        return DriverManager.getConnection(URL, USER, SENHA);
    }
}