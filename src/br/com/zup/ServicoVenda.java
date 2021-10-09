package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {

    private static List<Venda>vendas = new ArrayList<>();


    //Método cadastrar Venda
    public static Venda cadastrarVenda(String cpf, String cpfVendedor, double valorASerPago, String dataDeRegistro) throws Exception{
        Cliente cliente = ServicoCliente.pesquisarClientePorCpf(cpf);
        Vendedor vendedor = ServicoVendedor.pesquisarVendedorPorCpf(cpfVendedor);
        Venda venda = new Venda(cliente, vendedor, valorASerPago, dataDeRegistro );
        vendas.add(venda);
        return venda;
    }

    //Método mostrar lista de Vendas
    public static void listarVendas(){
        System.out.println(vendas.toString());
    }
}
