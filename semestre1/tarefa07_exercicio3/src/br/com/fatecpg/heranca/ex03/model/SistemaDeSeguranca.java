package br.com.fatecpg.heranca.ex03.model;

public class SistemaDeSeguranca implements IAutenticavel{
	/*
		Implemente essa interface na classe SistemaDeSeguranca. Nessa classe:
		Defina os valores de um login e senha corretos, como "admin" e "1234".
		No método login(), implemente a lógica para verificar se o usuário e senha inseridos correspondem aos valores corretos.
		Se o login for bem-sucedido, armazene um valor booleano que indica se o usuário está autenticado ou não.
	*/
	private String usuarioCorreto = "admin";
	private String senhaCorreta = "123";
	boolean autenticado = false;
	
	public SistemaDeSeguranca (String user, String psw) {
		this.login(user, psw);
	}
	
	public String getUsuarioCorreto() {
		return usuarioCorreto;
	}
	public void setUsuarioCorreto(String usuarioCorreto) {
		this.usuarioCorreto = usuarioCorreto;
	}
	public String getSenha() {
		return senhaCorreta;
	}
	public void setSenha(String senha) {
		this.senhaCorreta = senha;
	}
	
	public boolean login (String user, String psw) {
		if (user == usuarioCorreto && psw == senhaCorreta) {
			autenticado = true;
			System.out.println("Bem-vindo " + usuarioCorreto + "!");
			return true;
		}
		else {
			autenticado = false;
			System.out.println("Credenciais incorretas, tente novamente.");
			return false;
		}
	}
	
	public String logout () {
		if (autenticado == false) {
			return "Você não está logado ao sistema.";
		}
		else {
			return "Logout realizado com sucesso. Volte sempre! :D";
		}
	}
}