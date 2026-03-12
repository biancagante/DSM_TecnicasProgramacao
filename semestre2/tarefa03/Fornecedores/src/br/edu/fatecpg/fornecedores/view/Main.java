package br.edu.fatecpg.fornecedores.view;

import br.edu.fatecpg.fornecedores.client.ConsomeAPI;
import br.edu.fatecpg.fornecedores.database.DBConnection;
import br.edu.fatecpg.fornecedores.model.Empresa;
import br.edu.fatecpg.fornecedores.model.Socio;
import br.edu.fatecpg.fornecedores.repository.EmpresaRepository;
import br.edu.fatecpg.fornecedores.repository.SocioRepository;
import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Empresa> fornecedores = new ArrayList<>();
        boolean continuar = true;

        do {
            System.out.println("\033[93m- Digite o CPNJ a ser buscado: \033[0m");
            String cnpj = scanner.next();

            if (cnpj.equals("1")) {
                continuar = false;
                break;
            }

            String cnpjLimpo = cnpj.replaceAll("[^0-9]", "");

            Empresa empresa = ConsomeAPI.buscarCPNJ(cnpjLimpo);
            System.out.println(empresa);

            try (var conn = DBConnection.connection()) {
                EmpresaRepository empresaRepository = new EmpresaRepository();
                SocioRepository socioRepository = new SocioRepository();
                if(empresa != null) {
                    System.out.println(empresaRepository.cadastrarFornecedor(conn, empresa));
                    for (Socio socio : empresa.getSocios()) {
                        System.out.println(socioRepository.cadastrarSocio(conn, empresa, socio));
                    }
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } while (continuar);
    }
}

// MASSA DE TESTE
//05609657000174
//00000000000191
//62823257012964
//19131243000197
// 14.212.480/0001-69
// 08.144.854/0001-53