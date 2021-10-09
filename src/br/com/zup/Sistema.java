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

    //Método Menu Principal
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

    //Método Cadastrar Cliente
    public static Cliente cadastrarCliente() throws Exception{
        String nome = entradaDeDados("Digite o nome do Cliente: ").nextLine();
        String cpf = entradaDeDados("Digite o CPF do Cliente: ").nextLine();
        String email = entradaDeDados("Digite o E-mail do Cliente: ").nextLine();
        System.out.println("Cliente cadastrado com Sucesso!");
        return ServicoCliente.cadastrarCliente(nome, cpf, email);

    }

    //Método Cadastrar Vendedor que será responsável pelas Vendas
    public static Vendedor cadastrarVendedorResponsavel() throws Exception{
        String nome = entradaDeDados("Digite o nome do Vendedor: ").nextLine();
        String cpf = entradaDeDados("Digite o CPF do Vendedor: ").nextLine();
        String email = entradaDeDados("Digite o E-mail do Vendedor: ").nextLine();
        System.out.println("Vendedor cadastrado com Sucesso!");
        return ServicoVendedor.cadastrarVendedorResponsavel(nome, cpf, email);
    }

    //Método Cadastrar Vendas
    public static Venda cadastrarVenda() throws Exception{
        entradaDeDados("Digite o nome do Cliente dessa Venda: ").nextLine();
        entradaDeDados("Digite o nome do Vendedor Responsável por essa Venda: ").nextLine();
        String valorASerPago = entradaDeDados("Digite o valor a ser pago por essa Venda: ").nextLine();
        String dataDeRegistro = entradaDeDados("Digite a data de Registro da Venda: ").nextLine();
        System.out.println("Venda cadastrada com Sucesso!");
        return ServicoVenda.cadastrarVenda(Cliente cliente, Vendedor vendedor, valorASerPago, dataDeRegistro);
    }


    //Método que executa o sistema
    public static boolean executar() throws Exception {
        menu();
        boolean loop = true;
        while (loop) {
            int opcao = entradaDeDados("\nDigite o número da opção desejada:").nextInt();
            if (opcao == 1) {
                cadastrarCliente();
                menu();
            } else if (opcao == 2) {
                ServicoCliente.listarClientes();
                menu();
            }else if (opcao == 3){
                cadastrarVendedorResponsavel();
                menu();
            }else if (opcao == 4){
                ServicoVendedor.listarVendedores();
                menu();
            }
        }
        return loop;
    }

}
