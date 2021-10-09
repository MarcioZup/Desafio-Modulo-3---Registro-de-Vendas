package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {

    private static List<Venda>vendas = new ArrayList<>();


    //Método cadastrar Venda
    public static Venda cadastrarVenda(Cliente cliente, Vendedor vendedor, double valorASerPago, String dataDeRegistro) throws Exception{
        Venda venda = new Venda();
        vendas.add(venda);
        return venda;
    }

    //Método mostrar lista de Vendas
    public static void listarVendas(){
        System.out.println(vendas.toString());
    }
}
