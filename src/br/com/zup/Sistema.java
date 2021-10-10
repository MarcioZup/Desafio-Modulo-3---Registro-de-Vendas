package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static List<Cliente> clientes;

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
        System.out.println("7 - Consulta todas as Compras de um Cliente pelo CPF:");
        System.out.println("8 - Consulta todas as Vendas de um Vendedor pelo E-mail:");
        System.out.println("9 - Sair do Sistema");

    }

    //Método Cadastrar Cliente
    public static Cliente cadastrarCliente() throws Exception {
        String nome = entradaDeDados("Digite o nome do Cliente: ").nextLine();
        String cpf = entradaDeDados("Digite o CPF do Cliente: ").nextLine();
        String email = entradaDeDados("Digite o E-mail do Cliente: ").nextLine();
        return ServicoCliente.cadastrarCliente(nome, cpf, email);

    }

    //Método Cadastrar Vendedor que será responsável pelas Vendas
    public static Vendedor cadastrarVendedorResponsavel() throws Exception {
        String nome = entradaDeDados("Digite o nome do Vendedor: ").nextLine();
        String cpf = entradaDeDados("Digite o CPF do Vendedor: ").nextLine();
        String email = entradaDeDados("Digite o E-mail do Vendedor: ").nextLine();
        return ServicoVendedor.cadastrarVendedorResponsavel(nome, cpf, email);
    }

    //Método Cadastrar Vendas
    public static Venda cadastrarVenda() throws Exception {
        String cpf = entradaDeDados("Digite o CPF do Cliente dessa Venda: ").nextLine();
        String cpfVendedor = entradaDeDados("Digite o CPF do Vendedor Responsável por essa Venda: ").nextLine();
        double valorASerPago = entradaDeDados("Digite o valor a ser pago por essa Venda: R$ ").nextDouble();
        String dataDeRegistro = entradaDeDados("Digite a data de Registro da Venda: ").nextLine();
        return ServicoVenda.cadastrarVenda(cpf, cpfVendedor, valorASerPago, dataDeRegistro);
    }

    //Método que lista as compras de um Cliente específico por CPF
    public static List<Venda> pesquisarVendaPeloCpfCliente() throws Exception {
        String cpf = entradaDeDados("Digite o CPF do consumidor que deseja listar todas as compras: ").nextLine();
        ServicoCliente.pesquisarClientePorCpf(cpf);
        List<Venda> vendas = ServicoVenda.pesquisarCompraPeloCpfCliente(cpf);
        return vendas;
    }

    //Método que lista todas as vendas de um Vendedor específico por E-mail
    public static List<Venda> pesquisarCompraPeloCpfCliente() throws Exception {
        String cpf = entradaDeDados("Digite o CPF do consumidor que deseja listar todas as compras: ").nextLine();
        ServicoCliente.pesquisarClientePorCpf(cpf);
        List<Venda> vendas = ServicoVenda.pesquisarCompraPeloCpfCliente(cpf);
        return vendas;
    }

    //Método que lista as Vendas de um Vendedor específico por E-mail
    public static List<Venda> pesquisarVendaPeloEmailDoVendedor() throws Exception{
        String email = entradaDeDados("Digite o E-mail do Vendedor responsável que deseja listar todas as Vendas: ").nextLine();
        ServicoVendedor.pesquisarVendedorPorEmail(email);
        List<Venda> vendas = ServicoVenda.pesquisarVendaPeloEmailDoVendedor(email);
        return vendas;
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
            } else if (opcao == 3) {
                cadastrarVendedorResponsavel();
                menu();
            } else if (opcao == 4) {
                ServicoVendedor.listarVendedores();
                menu();
            } else if (opcao == 5) {
                cadastrarVenda();
                menu();
            } else if (opcao == 6) {
                ServicoVenda.listarVendas();
                menu();
            } else if (opcao == 7) {
                List<Venda> vendas = pesquisarCompraPeloCpfCliente();
                System.out.println(vendas);
                menu();
            }else if (opcao == 8) {
                List<Venda> vendas = pesquisarVendaPeloEmailDoVendedor();
                System.out.println(vendas);
                menu();
            }else if (opcao == 9) {
                System.out.println("Obrigado e Volte sempre. Você saiu do Sistema");
                loop = false;
            } else {
                System.out.println("Digite uma opção válida!");
                menu();
            }
        }
        return loop;
    }

}
