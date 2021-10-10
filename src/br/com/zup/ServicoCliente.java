package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    public static List<Cliente>clientes = new ArrayList<>();
    int tamanhoDaLista = clientes.size();

    //Método para validar se E-mail tem @
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Este E-mail está inválido.");
        }
    }

    //Método para verificar se o CPF já está entre os cadastrados existentes
    public static void verificarCpfExistentes(String cpf) throws Exception{
        for (Cliente referencia : clientes) {
            if (referencia.getCpf().equals(cpf)){
                throw new Exception("Este CPF já consta no cadastro. Operação NÃO realizada.");
            }
        }
    }

    //Método para verificar se o E-mail do Cliente já está no cadastro
    public static void verificarEmailExistente(String email) throws Exception{
        for (Cliente referencia : clientes) {
            if (referencia.getEmail().equals(email)){
                throw new Exception("Este E-mail já consta no cadastro! Operação NÃO realizada.");
            }
        }
    }

    //Método cadastrar Cliente
    public static Cliente cadastrarCliente(String nome, String cpf, String email) throws Exception{
        validarEmail(email);
        verificarEmailExistente(email);
        verificarCpfExistentes(cpf);
        Cliente cliente = new Cliente(nome, cpf, email);
        clientes.add(cliente);
        return cliente;
    }

    //Método mostrar lista de Clientes
    public static void listarClientes(){
        if (clientes.size() == 0){
            System.out.println("Não existem Clientes cadastrados");
        }else {
            System.out.println(clientes.toString());
        }
    }

    //Método para pesquisar Cliente
    public static Cliente pesquisarClientePorCpf(String cpf) throws Exception{
        for (Cliente referencia: clientes) {
            if (referencia.getCpf().equals(cpf)){
                return referencia;
            }
        }
        throw new Exception("Este Cliente não está cadastrado.  Cadastre o cliente para prosseguir.");
    }




}
