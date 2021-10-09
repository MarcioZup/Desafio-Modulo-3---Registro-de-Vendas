package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static List<Cliente>clientes;

    //Método entrada de dados pelo usuário
    private static Scanner entradaDeDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    private static void menu() {
        System.out.println("-----------------------------");
        System.out.println("Sistema de Registro de Vendas");
        System.out.println("-----------------------------");
        System.out.println("1 - Cadastro de Cliente");
        System.out.println("2 - Consulta lista de Clientes ");
        System.out.println("3 - Cadastra Vendedor Responsável pela Venda");
        System.out.println("4 - Consulta lista de Vendedores");
        System.out.println("5 - Cadastro de Vendas");
        System.out.println("6 - Consulta Vendas");

    }

    public static Cliente cadastrarCliente() throws Exception{
        String nome = entradaDeDados("Digite o nome do Cliente: ").nextLine();
        String cpf = entradaDeDados("Digite o CPF do Cliente: ").nextLine();
        String email = entradaDeDados("Digite o E-mail do Cliente: ").nextLine();
        System.out.println("Cliente cadastrado com Sucesso!");
        return ServicoCliente.cadastrarCliente(nome, cpf, email);

    }

    public static boolean executar() throws Exception {
        menu();
        boolean loop = true;
        while (loop) {
            int opcao = entradaDeDados("\nDigite o número da opção desejada:").nextInt();
            if (opcao == 1) {
                cadastrarCliente();
            } else if (opcao == 2) {
                ServicoCliente.listarClientes();
            }
        }
        return loop;
    }

}
