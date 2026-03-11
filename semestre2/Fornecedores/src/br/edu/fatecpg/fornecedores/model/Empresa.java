package br.edu.fatecpg.fornecedores.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    @SerializedName("razao_social") private String razaoSocial;
    @SerializedName("nome_fantasia") private String nomeFantasia;
    private String logradouro;
    @SerializedName("qsa") private ArrayList<Socio> socios;

    public Empresa(String cnpj, String razaoSocial, String nomeFantasia, String logradouro) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.logradouro = logradouro;
    }

    public Empresa(String cnpj, String razaoSocial, String nomeFantasia, String logradouro, ArrayList<Socio> socios) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.logradouro = logradouro;
        this.socios = socios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    @Override
    public String toString() {
        return "Empresa {" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", socios=" + socios +
                '}';
    }
}
