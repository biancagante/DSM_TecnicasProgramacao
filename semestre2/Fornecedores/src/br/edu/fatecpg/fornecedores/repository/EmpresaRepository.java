package br.edu.fatecpg.fornecedores.repository;

import br.edu.fatecpg.fornecedores.model.Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpresaRepository {
    public String cadastrarFornecedor(Connection conn, Empresa empresa) throws SQLException {
        var insert = "INSERT INTO tb_empresa(cnpj, razao_social, nome_fantasia, logradouro) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(insert)) {
            stmt.setString(1, empresa.getCnpj());
            stmt.setString(2, empresa.getRazaoSocial());
            stmt.setString(3, empresa.getNomeFantasia());
            stmt.setString(4, empresa.getLogradouro());
            stmt.execute();
            return "\033[92mNovo fornecedor cadastrado.\033[0m";
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return "\033[91mErro ao cadastrar fornecedor.\033[0m";
        }
    }
}
