package br.com.zup;

import java.util.Scanner;

public class Sistema {

    //Método entrada de dados pelo usuário
    private static Scanner entradaDeDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    private static void menu(){
        System.out.println("-----------------------------");
        System.out.println("Sistema de Registro de Vendas");
        System.out.println("-----------------------------");
        System.out.println("Selecione a opção desejada: ");
        System.out.println("1 - Cadastro de Cliente");
        System.out.println("2 - Consulta lista de Clientes ");
        System.out.println("3 - Cadastra Vendedor Responsável pela Venda");
        System.out.println("4 - Consulta lista de Vendedores");
        System.out.println("5 - Cadastro de Vendas");
        System.out.println("6 - Consulta Vendas");

    }

}
