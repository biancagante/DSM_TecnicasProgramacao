package br.edu.fatecpg.progabstracao.view;
import br.edu.fatecpg.progabstracao.model.Carro;

public class Main {

	public static void main(String[] args) {		
		Carro meuCarro = new Carro();

		meuCarro.ligar();
		meuCarro.acelerar();
		meuCarro.desligar();
		meuCarro.buzinar();
		meuCarro.frear();
	}

}
