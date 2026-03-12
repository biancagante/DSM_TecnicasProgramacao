package br.edu.fatecpg.tecprogII.revisao.model;

public class TreinamentoPresencial extends Treinamento{
	private String local;
	
	public TreinamentoPresencial(int id, Instrutor ins, String ling, int horas, String local) {
		super(id, ins.getNome(), ling, horas);
		this.local = local;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Treinamento: {" + super.toString() + "\nTipo: Presencial [local=" + local + "]}\n";
	}
	
}
