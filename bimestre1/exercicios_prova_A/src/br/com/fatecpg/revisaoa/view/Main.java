package br.com.fatecpg.revisaoa.view;
import br.com.fatecpg.revisaoa.model.Aluno;
import br.com.fatecpg.revisaoa.model.Carro;
import br.com.fatecpg.revisaoa.model.Farmacia;

public class Main {

	public static void main(String[] args) {
		/*
		 *	6. Objetivo: Criar uma classe simples com atributos públicos e manipular objetos.

			Descrição: Crie a classe Carro com os seguintes atributos públicos: marca, modelo, ano. No método principal: Crie um objeto Carro, a
			tribua valores aos atributos e imprima as informações do carro.
		*/
		System.out.println("PROVA A - Exercício 6");
		Carro novoCarro = new Carro();
		novoCarro.marca = "Ford";
		novoCarro.modelo = "Fiesta";
		novoCarro.ano = 2010;
		System.out.println("Carro: " + novoCarro.marca + " " + novoCarro.modelo + " " + novoCarro.ano + ".");
		
		/*
		 * 7. Objetivo: Aplicar encapsulamento usando get e set.

			Descrição: Crie uma classe Aluno com os atributos privados: nome, matricula, notaFinal. Implemente os métodos: getNome(), setNome(), getNotaFinal(), 
			setNotaFinal() etc. No programa principal: Use os métodos para definir e exibir as informações do aluno. 
		*/
		System.out.println("\nPROVA A - Exercício 7");
		Aluno alunoDois = new Aluno("Bianca", 2, 0);
		alunoDois.setNotaFinal(10); // :D
		System.out.println("Nome: " + alunoDois.getNome() + 
							"\nMatrícula: " + alunoDois.getMatricula() + 
							"\nNota Final: " + alunoDois.getNotaFinal());
		/*
		 * 8. Farmácia com Controle de Validade

			Crie uma classe Farmacia com: 
			Um array de String chamado nomesMedicamentos;
			Um array de int chamado diasParaVencimento;
			Um array de double chamado precos.
			
			Implemente métodos para:
			1. Mostrar todos os medicamentos, seus preços e dias restantes para vencimento.
			2. Calcular a média de dias para vencimento de todos os medicamentos.
			3. Identificar quais medicamentos estão próximos de vencer (ex.: menos de 5 dias).
			4. Aplicar automaticamente um desconto de 50% para medicamentos que estão próximos de vencer.
			5. Vender um medicamento, removendo-o do array. 
		 */
		System.out.println("\nPROVA A - Exercício 8");
		Farmacia farmaciaUm = new Farmacia(5);
		farmaciaUm.setNomeMedicamento("Ibuprofeno", 90, 10, 1);
		farmaciaUm.setNomeMedicamento("Paracetamol", 45, 6.5, 2);
		farmaciaUm.setNomeMedicamento("Cimegripe", 6, 17, 3);
		farmaciaUm.setNomeMedicamento("Dulcolax", 5, 17.32, 4);
		farmaciaUm.setNomeMedicamento("Alginac", 15, 31.61, 5);
		farmaciaUm.getMedicamentos();	
		farmaciaUm.mediaDiasValidade();
		farmaciaUm.verificaVencimento();
		farmaciaUm.venderMedicamento(3, 4);
		farmaciaUm.getMedicamentos();
	}
}
