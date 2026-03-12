package br.edu.fatecpg.fornecedores.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connection() {
        try {
            var jdbcUrl = "jdbc:postgresql://localhost:5432/db_fornecedores";
            var user = "postgres";
            var password = "bibi777";
            return DriverManager.getConnection(jdbcUrl, user, password);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
