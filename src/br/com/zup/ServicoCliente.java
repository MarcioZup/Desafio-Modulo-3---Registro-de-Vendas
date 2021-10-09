package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    public static List<Cliente>clientes = new ArrayList<>();

    //Método para validar se E-mail tem @
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Este E-mail está inválido.");
        }
    }

    //Método cadastrar Cliente
    public static Cliente cadastrarCliente(String nome, String cpf, String email) throws Exception{
        validarEmail(email);
        Cliente cliente = new Cliente(nome, cpf, email);
        clientes.add(cliente);
        return cliente;
    }

    //Método mostrar lista de Clientes
    public static void listarClientes(){
        System.out.println(clientes.toString());
    }

    //Método para pesquisar Cliente
    public static Cliente pesquisarClientePorCpf(String cpf) throws Exception{
        for (Cliente referencia: clientes) {
            if (referencia.getCpf().equals(cpf)){
                return referencia;
            }
        }
        throw new Exception("Este Cliente não está cadastrado. Venda NÃO concluída. Cadastre o cliente para prosseguir.");
    }




}
