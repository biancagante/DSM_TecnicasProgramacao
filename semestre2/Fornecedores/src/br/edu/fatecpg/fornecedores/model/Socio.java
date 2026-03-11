package br.edu.fatecpg.fornecedores.model;

import com.google.gson.annotations.SerializedName;

public class Socio {
    @SerializedName("nome_socio") private String nomeSocio;
    @SerializedName("cnpj_cpf_do_socio") private String cnpjCpfDoSocio;
    @SerializedName("qualificacao_socio") private String  qualificacaoSocio;

    public Socio(String nomeSocio, String cnpjCpfDoSocio, String qualificacaoSocio) {
        this.nomeSocio = nomeSocio;
        this.cnpjCpfDoSocio = cnpjCpfDoSocio;
        this.qualificacaoSocio = qualificacaoSocio;
    }

    public String getNomeSocio() {
        return nomeSocio;
    }

    public void setNomeSocio(String nomeSocio) {
        this.nomeSocio = nomeSocio;
    }

    public String getCnpjCpfDoSocio() {
        return cnpjCpfDoSocio;
    }

    public void setCnpjCpfDoSocio(String cnpjCpfDoSocio) {
        this.cnpjCpfDoSocio = cnpjCpfDoSocio;
    }

    public String getQualificacaoSocio() {
        return qualificacaoSocio;
    }

    public void setQualificacaoSocio(String qualificacaoSocio) {
        this.qualificacaoSocio = qualificacaoSocio;
    }

    @Override
    public String toString() {
        return "Socio {" +
                "nomeSocio='" + nomeSocio + '\'' +
                ", cnpjCpfDoSocio='" + cnpjCpfDoSocio + '\'' +
                ", qualificacaoSocio='" + qualificacaoSocio + '\'' +
                '}';
    }
}
