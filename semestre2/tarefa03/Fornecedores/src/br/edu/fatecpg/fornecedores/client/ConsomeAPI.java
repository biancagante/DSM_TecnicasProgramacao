package br.edu.fatecpg.fornecedores.client;

import br.edu.fatecpg.fornecedores.model.Empresa;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsomeAPI {
    public static Gson gson = new Gson();

    public static Empresa buscarCNPJ(String cnpj) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create("https://brasilapi.com.br/api/cnpj/v1/" + cnpj))
                .build();
        HttpResponse<String> response = null;
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int statusCode = response.statusCode();

        if(statusCode == 200) {
            return gson.fromJson(response.body(), Empresa.class);
        }

        else if (statusCode == 400) {
            throw new RuntimeException("Erro 400 - CNPJ inválido");
        }

        else if(statusCode == 404) {
            throw new RuntimeException("Erro 404 - CNPJ não encontrado");
        }
        return null;
    }
}
