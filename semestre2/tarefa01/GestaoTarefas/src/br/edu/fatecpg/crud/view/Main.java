package br.edu.fatecpg.crud.view;
import br.edu.fatecpg.crud.model.*;
import br.edu.fatecpg.crud.db.Database;
// java utilities
//import java.util.ArrayList;
import java.util.Scanner;
// sql imports
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args) {
    	int opcaoEscolhida;
    	
        try (var conn = Database.connection()) {
            System.out.println("Conexão estabelecida com sucesso!\n");
            
            do {
            	System.out.print(menuTarefa());
            	opcaoEscolhida = Integer.parseInt(scan.next());
            	scan.nextLine();
            	
            	switch (opcaoEscolhida) {
		        	case 1:
		        		boolean tarefaCriada = criarTarefa(conn);	
		        		
		        		if (tarefaCriada) {
		        			System.out.println("Tarefa criada com sucesso!");
		        		}
		        		else {
		        			System.out.println("Não foi possível cadastrar a tarefa.");
		        		}
		        		break;
		        		
		        	case 2:
		        		System.out.println("\n-- Editar tarefa");
		        		atualizarTarefa(conn);
		        		break;
		        		
		        	case 3:     		
		        		menuListagemTarefas(conn);
		        		break;
		        		
		        	case 4:
		        		System.out.println("\n-- Deletar tarefa");
		        		if (deletarTarefa(conn)) {
		        			System.out.println("Tarefa deletada com sucesso.");
		        		}
		        		break;
		        	case 5:
		        		System.out.println("Tchau, tenha um ótimo dia ❤");
		        		break;
		        	default:
		        		System.out.println("Opção escolhida inválida.");
		        		break;
            	}
            } while (opcaoEscolhida != 5);
            
            scan.close();
        } catch (SQLException e) {
        	System.out.println("Conexão não estabelecida!\n");
        	System.err.println(e.getMessage());
        }
        
    }
    
    public static String menuTarefa() {
    	return (
    			"\nEscolha uma das opções abaixo: "
    			+ "\n1.Nova tarefa"
    			+ "\n2.Editar tarefa"
    			+ "\n3.Listar tarefas"
    			+ "\n4.Deletar tarefa"
    			+ "\n5.Sair"
    			+ "\n\tSua escolha: ");
    }
    
    public static void menuListagemTarefas(Connection conn) {
    	System.out.println(
    			"\n-- Listar tarefas"
				+ "\n1.Todas"
				+ "\n2.Apenas concluídas"
				+ "\n3.Apenas não concluídas"
				+ "\n4.Apenas de uma categoria"
				+ "\n5.Voltar para menu principal"
				+ "\n\tSua escolha: "
		);
    	int opcaoListagem = Integer.parseInt(scan.next());
    	
    	switch (opcaoListagem) {
    		case 1:
    			listarTarefas(conn, null, null);
    			break;
    		case 2:
    			listarTarefas(conn, "status", "true");
    			break;
    		case 3:
    			listarTarefas(conn, "status", "false");
    			break;
    		case 4:
    			System.out.println("Escolha a categoria: ");
    			String categoria = scan.next();
    			listarTarefas(conn, "categoria", categoria);
    			break;
    		case 5:
    			System.out.println("Voltando...");
    			break;
    		default:
    			System.out.println("Opção inválida.");
    			break;
    	}
    }
    
    public static boolean formatarStatus(String status) {
    	return switch(status.trim().toLowerCase()) {
    		case "s", "sim", "y", "yes", "t", "true", "1", "concluído", "concluido" -> true;
    		default -> false;
    	};
    }
    
    // FUNÇÕES CRUD
    public static boolean criarTarefa(Connection conn) {
    	var criarTarefa = "INSERT INTO tb_tarefa(nome, descricao, status, categoria) VALUES (?, ?, ?, ?)";
   
    	System.out.print("\n-- Insira os dados da nova tarefa --");
		
		System.out.print("\n- Nome: ");
		String nome = scan.nextLine();
		System.out.print("- Descrição: ");
		String desc = scan.nextLine();
		System.out.print("- Status: ");
		boolean status = formatarStatus(scan.nextLine());
		System.out.print("- Categoria: ");
		String categoria = scan.nextLine();
		
		try(PreparedStatement insert = conn.prepareStatement(criarTarefa)) {						
			insert.setString(1, nome);
			insert.setString(2, desc);
			insert.setBoolean(3, status);
			insert.setString(4, categoria);
			
			insert.execute();
			return true;
		} catch (SQLException e) {
			System.err.println("Erro ao cadastrar tarefa: " + e.getMessage());
			return false;
		}
    }
    
    public static boolean editarTarefa() {
    	return false;
    }
    
    public static void listarTarefas(Connection conn, String filtro, String condicao) {
    	// caso queira adicionar os dados ao invés de visualizar
    	// ArrayList<Tarefa> tarefas = new ArrayList<>();
    	var listar = "SELECT * FROM tb_tarefa";
    	
    	if (filtro != null && condicao != null) {
    		listar += " WHERE " + filtro + "= '" + condicao + "'";
    	}
    	
    	listar += " ORDER BY id ASC;";
    	
    	try (PreparedStatement select = conn.prepareStatement(listar)) {
    		ResultSet rs = select.executeQuery();
    		
    		if (!rs.next()) {
    			System.out.println("Não foram encontrados resultados.");
    		}
    		
    		else {
    			System.out.println("ID| Nome | Descrição | Status | Categoria");

    		    do {
    		        System.out.println(
    		            rs.getInt("id") + " | " +
    		            rs.getString("nome") + " | " +
    		            rs.getString("descricao") + " | " +
    		            (rs.getBoolean("status") ? "Concluído" : "Não concluído") + " | " +
    		            rs.getString("categoria")
    		        );
    		    } while (rs.next());
    		}
    	} catch (SQLException e) {
    		System.out.println("Não foi possível listar tarefas: " + e.getMessage());
    	}
    }
    
    public static boolean atualizarTarefa(Connection conn) {
    	var editarTarefa = "UPDATE tb_tarefa SET nome = ?, descricao = ?, status = ?, categoria = ? WHERE id = ?";
    	
    	System.out.println("IMPORTANTE! Informe o ID da tarefa para atualizarmos: ");
    	int id = Integer.parseInt(scan.next());
    	scan.nextLine();
    		
    	try (PreparedStatement update = conn.prepareStatement(editarTarefa)) {
    		System.out.print("- Nome: ");
    		String nome = scan.nextLine();
    		System.out.print("- Descrição: ");
    		String desc = scan.nextLine();
    		System.out.print("- Status: ");
    		boolean status = formatarStatus(scan.nextLine());
    		System.out.print("- Categoria: ");
    		String categoria = scan.nextLine();
    		
    		update.setString(1, nome);
    		update.setString(2, desc);
    		update.setBoolean(3, status);
    		update.setString(4, categoria);
    		update.setInt(5, id);
			
    		int linhasAtualizadas = update.executeUpdate();
			return linhasAtualizadas > 0;
    	} catch(SQLException e) {
    		System.err.println(e.getMessage());
    		return false;
    	}
    }
    
    public static boolean deletarTarefa(Connection conn) {
    	int id = 0;
    	
    	var deletarTarefa = "DELETE FROM tb_tarefa WHERE id = ?";
    	var deletarConcluidos = "DELETE FROM tb_tarefa WHERE status = ?";
    	
    	System.out.println(
    			"\n-- Deletar tarefa"
				+ "\n1.Uma tarefa específica"
				+ "\n2.Todas as concluídas"
				+ "\n3.Voltar para menu principal"
    	);
    	int opcaoDeletar = Integer.parseInt(scan.next());
    	
    	try {
    		switch (opcaoDeletar) {
    			case 1:
    				PreparedStatement delete = conn.prepareStatement(deletarTarefa);
	    			System.out.println("IMPORTANTE! Informe o ID da tarefa para deletarmos: ");
	    			id = Integer.parseInt(scan.next());
	    			scan.nextLine();
	    			delete.setInt(1, id);
	    			delete.execute();
	    			break;
    			case 2:
    				PreparedStatement deleteStatusTrue = conn.prepareStatement(deletarConcluidos);
    				deleteStatusTrue.setBoolean(1, true);
    				deleteStatusTrue.execute();
    				break;
    			case 3:
    				break;
    			default:
    				System.out.println("Opção inválida.");
    				break;
    		}
    			
    		return true;
    	} catch(SQLException e) {
    		System.out.println("Erro ao deletar tarefa. " + e.getMessage());
    		return false;
    	}
    }
}