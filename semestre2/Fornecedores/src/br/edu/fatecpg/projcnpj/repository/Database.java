package br.edu.fatecpg.projcnpj.repository;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Database {
    public static Connection connection() {
        try {
            var jdbcUrl = "jdbc:postgresql://localhost:5432/db_fornecedores";
            var user = "postgres";
            var password = "fatec777";
            return DriverManager.getConnection(jdbcUrl, user, password);
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
