package br.com.fatecpg.associacaolistas.model;
import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String cpnj;
	Cliente[] clientes = new Cliente[5];
	Funcionario[] funcionarios = new Funcionario[10];
	
	public Empresa(String nome, String cpnj) {
		this.nome = nome;
		this.cpnj = cpnj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	
	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cpnj=" + cpnj + "]";
	}
	
	public String adicionarCliente(String nome, String email) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] == null) {		
				clientes[i] = new Cliente(nome, email);
				return "Cliente adicionado com sucesso.";
			}
		}
		return "Lista cheia";
	}
	
	public String exibirClientes() {
		StringBuilder dados = new StringBuilder();
	    for (int i = 0; i < clientes.length; i++) {
	        if (clientes[i] != null) {
	        	dados.append("Nome: " + clientes[i].getNome() + " | E-mail: " + clientes[i].getEmail() + "\n");
	        }
	    }
	    return dados.toString();
	}
	
	public String adicionarFuncionario(String nome, String cargo, double salario) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] == null) {		
				funcionarios[i] = new Funcionario(nome, cargo, salario);
				return "Funcionário adicionado com sucesso.";
			}
		}
		return "Lista cheia";
	}
	
	public String exibirFuncionarios() {
		StringBuilder dadosFunc = new StringBuilder();
	    for (int i = 0; i < funcionarios.length; i++) {
	        if (funcionarios[i] != null) {
	        	dadosFunc.append("Nome: " + funcionarios[i].getNome() + " | Cargo: " + funcionarios[i].getCargo() + " | Salário: " + funcionarios[i].getSalario() + "\n");
	        }
	    }
	    return dadosFunc.toString();
	}
	
	public double calcularFolhaSalarial() {
		int vl_final = 0;
		for (Funcionario f: funcionarios) {
			if (f != null) {
				vl_final += f.getSalario();
			}
		}
		return vl_final;
	}
	
	public double calcularMediaSalarial () {
		Calculadora calculadora = new Calculadora();
		double soma = 0;
		int qtd = 0;
		
		for(Funcionario f: funcionarios) {
			if (f != null) {
				soma = calculadora.somar(soma, f.getSalario());
				qtd++;
			}
			if (qtd == 0) return 0;
		}
		return soma / qtd;
	}
	
	public double exibirMediaSalarial() {
		double media = calcularMediaSalarial();
		return media;
	}
}
