package br.edu.fatecpg.tecprogII.revisao.model;

public class TreinamentoOnline extends Treinamento {
	private String linkAcesso;
	
	public TreinamentoOnline(int id, Instrutor ins, String ling, int horas, String link) {
		super(id, ins.getNome(), ling, horas);
		this.linkAcesso = link;
	}

	public String getLinkAcesso() {
		return linkAcesso;
	}

	public void setLinkAcesso(String linkAcesso) {
		this.linkAcesso = linkAcesso;
	}

	@Override
	public String toString() {
		return "Treinamento: {" + super.toString() + "\nTipo: Online [linkAcesso=" + linkAcesso + "]}\n";
	}
	
}
