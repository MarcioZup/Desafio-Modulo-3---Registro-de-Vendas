package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    public static List<Cliente>clientes = new ArrayList<>();

    //Método cadastrar Cliente
    public static Cliente cadastrarCliente(String nome, String cpf, String email){
        Cliente cliente = new Cliente(nome, cpf, email);
        clientes.add(cliente);
        return cliente;
    }


}
