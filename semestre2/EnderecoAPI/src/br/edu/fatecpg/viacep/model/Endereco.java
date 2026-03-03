package br.edu.fatecpg.viacep.model;

public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    
    public Endereco (String cep) {
    	this.cep = cep;
    }

    public Endereco(String cep, String lografouro, String bairro, String localidade) {
        this.cep = cep;
        this.logradouro = lografouro;
        this.bairro = bairro;
        this.localidade = localidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLografouro() {
        return logradouro;
    }

    public void setLografouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}