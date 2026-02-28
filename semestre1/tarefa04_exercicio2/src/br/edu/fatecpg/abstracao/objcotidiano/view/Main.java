package br.edu.fatecpg.abstracao.objcotidiano.view;
// CHAMANDO TODAS AS CLASSES DO MODEL
import br.edu.fatecpg.abstracao.objcotidiano.model.Cadeira;
import br.edu.fatecpg.abstracao.objcotidiano.model.Celular;
import br.edu.fatecpg.abstracao.objcotidiano.model.Mesa;
import br.edu.fatecpg.abstracao.objcotidiano.model.Notebook;
import br.edu.fatecpg.abstracao.objcotidiano.model.Relogio;

public class Main {

	public static void main(String[] args) {
		Cadeira novaCadeiraUm = new Cadeira();
		Cadeira novaCadeiraDois = new Cadeira();
		
		novaCadeiraUm.material = "Madeira Maciça";
		novaCadeiraUm.cor = "Marrom";
		novaCadeiraUm.altura = 86;
		novaCadeiraUm.comprimento = 53;
		novaCadeiraUm.largura = 47;
		
		novaCadeiraDois.material = "MDF";
		novaCadeiraDois.cor = "Branca";
		novaCadeiraDois.altura = 90;
		novaCadeiraDois.comprimento = 56;
		novaCadeiraDois.largura = 48;
		
		System.out.println("====== Objeto do cotidiano: CADEIRA =====\n");			
		
		System.out.println("Cadeira 1\nMaterial: " + novaCadeiraUm.material);
		novaCadeiraUm.sentar();
		
		System.out.println("\nCadeira 2\nAltura: " + novaCadeiraDois.altura);
		novaCadeiraDois.apoiarItens();
		//////////////////////////////////////////////////////////////////////
		Mesa novaMesaUm = new Mesa();
		Mesa novaMesaDois = new Mesa();
		
		novaMesaUm.formato = "Redonda";
		novaMesaUm.material = "Madeira";
		novaMesaUm.altura = 75;
		novaMesaUm.comprimento = 120;
		novaMesaUm.largura = 60;
		
		novaMesaDois.formato = "Quadrada";
		novaMesaDois.material = "Tampo de vidro e pernas de aço";
		novaMesaDois.altura = 80;
		novaMesaDois.comprimento = 150;
		novaMesaDois.largura = 75;
		
		System.out.println("\n====== Objeto do cotidiano: MESA =======\n");
		System.out.println("Mesa 1\nFormato: " + novaMesaUm.formato);
		novaMesaUm.colocarObjetos();
		
		System.out.println("\nMesa 2\nMaterial: " + novaMesaDois.material);
		novaMesaDois.comer();
		/////////////////////////////////////////////////////////////////////
		Celular novoCelularUm = new Celular();
		Celular novoCelularDois = new Celular();
		
		novoCelularUm.marca = "Motorola";
		novoCelularUm.sistemaOperacional = "Android";
		novoCelularUm.cor = "Preto";
		novoCelularUm.memoria = 6;
		novoCelularUm.polegadaTela = 6.7;
		
		novoCelularDois.marca = "iPhone";
		novoCelularDois.sistemaOperacional = "IOS";
		novoCelularDois.cor = "Verde";
		novoCelularDois.memoria = 6;
		novoCelularDois.polegadaTela = 6.1;
		
		System.out.println("\n====== Objeto do cotidiano: CELULAR =====\n");
		System.out.println("Celular 1\nCor: " + novoCelularUm.cor);
		novoCelularUm.instalarAplicativos();
		
		System.out.println("\nCelular 2\nSistema Operacional: " + novoCelularDois.sistemaOperacional);
		novoCelularDois.tirarFoto();
		///////////////////////////////////////////////////////////////////////
		Notebook novoNotebookUm = new Notebook();
		Notebook novoNotebookDois = new Notebook();
		
		novoNotebookUm.sistemaOperacional = "Windows 10";
		novoNotebookUm.tipoArmazenamento = "HD";
		novoNotebookUm.processador = "Intel Core i3";
		novoNotebookUm.tamanhoTela = 15.6;
		novoNotebookUm.memoria = 8;
		
		novoNotebookDois.sistemaOperacional = "Windows 11";
		novoNotebookDois.tipoArmazenamento = "SSD";
		novoNotebookDois.processador = "AMD Ryzen 5";
		novoNotebookDois.tamanhoTela = 16;
		novoNotebookDois.memoria = 16;
		
		System.out.println("\n====== Objeto do cotidiano: NOTEBOOK =====\n");
		System.out.println("Notebook 1\nCor: " + novoNotebookUm.processador);
		novoNotebookUm.ligarComputador();
		
		System.out.println("\nNotebook 2\nSistema Operacional: " + novoNotebookUm.sistemaOperacional);
		novoNotebookDois.instalarSoftware();
		///////////////////////////////////////////////////////////////////////
		Relogio novoRelogioUm = new Relogio();
		Relogio novoRelogioDois = new Relogio();
		
		novoRelogioUm.modelo = "Analógico";
		novoRelogioUm.materialCaixa = "Metal";
		novoRelogioUm.materialPulseira = "Metal";
		novoRelogioUm.corPulseira = "Prata";
		novoRelogioUm.tamanhoPulseira = 18.0;
		
		novoRelogioDois.modelo = "Digital";
		novoRelogioDois.materialCaixa = "Alumínio";
		novoRelogioDois.materialPulseira = "Silicone";
		novoRelogioDois.corPulseira = "Rosa";
		novoRelogioDois.tamanhoPulseira = 16.5;
		
		System.out.println("\n====== Objeto do cotidiano: RELÓGIO =====\n");
		System.out.println("Relógio 1\nModelo: " + novoRelogioUm.modelo);
		novoRelogioUm.verHoras();
		
		System.out.println("\nRelógio 2\nCor da Pulseira: " + novoRelogioDois.corPulseira);
		novoRelogioDois.carregarBateria();
	}
}