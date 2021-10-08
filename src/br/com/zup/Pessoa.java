package br.com.zup;

public abstract class Pessoa {

    //Atributos
    private String nome;
    private String cpf;
    private String email;

    //Métodos Construtores
    public Pessoa() {

    }

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //.toString
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome: ");
        retorno.append("\nCPF: ");
        retorno.append("\nE-mail: ");
        return retorno.toString();
    }
}
