package br.edu.fatecpg.fornecedores.repository;

import br.edu.fatecpg.fornecedores.model.Empresa;
import br.edu.fatecpg.fornecedores.model.Socio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SocioRepository {
    public String cadastrarSocio(Connection conn, Empresa empresa, Socio socio) {
        var insert = "INSERT INTO tb_socio(nome_socio, cnpj_cpf_do_socio, qualificacao_socio, cnpj) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(insert)) {
            stmt.setString(1, socio.getNomeSocio());
            stmt.setString(2, socio.getCnpjCpfDoSocio());
            stmt.setString(3, socio.getQualificacaoSocio());
            stmt.setString(4, empresa.getCnpj());
            stmt.execute();
            return "\033[92mSócio cadastrado com sucesso!\033[0m";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return "\033[91mErro ao cadastrar Socio!\033[0m";
        }
    }
}
