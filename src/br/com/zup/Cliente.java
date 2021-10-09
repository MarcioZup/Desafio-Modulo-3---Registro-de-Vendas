package br.com.zup;

public class Cliente extends Pessoa{

    //Construtor
    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome: " + getNome());
        retorno.append("\nCPF: " + getCpf());
        retorno.append("\nE-mail: " + getEmail());
        return retorno.toString();
    }
}
