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

    //Método para pesquisar Vendas de um cliente específico através do CPF
    public static List<Venda> pesquisarVendaPeloCpfCliente(String cpf){
        List<Venda> vendasDoCliente = new ArrayList<>();
        for (Venda referencia: vendas) {
            if (referencia.getCliente().getCpf().equals(cpf)){
                vendasDoCliente.add(referencia);
            }
        }
        return vendasDoCliente;
    }
}
