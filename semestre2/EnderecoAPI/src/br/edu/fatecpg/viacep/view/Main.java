package br.edu.fatecpg.viacep.view;

import java.util.Scanner;
import java.util.ArrayList;
import br.edu.fatecpg.viacep.model.Endereco;
import br.edu.fatecpg.viacep.service.ConsomeAPI;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InterruptedIOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        Gson gson = new Gson();
        ArrayList<Endereco> enderecos = new ArrayList<>();
        boolean rodando = true;

        while (rodando) {
        	System.out.println("\nDigite sua escolha abaixo: " +
        			"\n\t1.Buscar endereço" +
        			"\n\t2.Excluir endereços da lista" +
        			"\n\t3.Exibir histórico de endereços pesquisados" +
        			"\n\t4.Sair do programa" +
        			"\nSua escolha: ");
        	int opcaoEscolhida = scan.nextInt();
        	
            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("\nDigite o endereço a ser buscado: ");
                    String cep = scan.next();
                    boolean enderecoCadastrado = false;

                    for (Endereco e : enderecos) {
                    	if (e.getCep().replaceAll("\\D", "").equals(cep)) {
                    		System.out.println("\n" + e.toString());
                    		enderecoCadastrado = true;
                    	}
                    }
                    
                    if (enderecoCadastrado) {
                    	System.out.println("Endereço já cadastrado.");
                    	break;
                    }
                    else {
                    	String retorno = ConsomeAPI.buscaCEP(cep);
                    	Endereco end = gson.fromJson(retorno, Endereco.class);
                    	System.out.println(end);
                    	enderecos.add(end);
                    }
                   	break;
                case 2:
                	System.out.println("\nInforme o CEP para excluir:");
                	String cepExcluir = scan.next();
                	boolean existe = false;
                	Endereco enderecoExcluido = null;
                	
                	for (Endereco e : enderecos) {
                    	if (e.getCep().replaceAll("\\D", "").equals(cepExcluir)) {
                    		existe = true;
                    		enderecoExcluido = e;
                    	}
                    }
                	
                	if(existe) {
                		enderecos.remove(enderecoExcluido);
                		System.out.println("Endereço excluido");
                	}
                	
                	break;
                case 3:
                	System.out.println("\nHistórico:");
                	enderecos.forEach(System.out::println);
                	break;
                case 4:
                	System.out.println("Parando programa... Até mais!");
                	rodando = false;
                	break;
                default:
                	System.out.println("Opção inválida");
                	break;
            }
        }
        scan.close();
    }
}