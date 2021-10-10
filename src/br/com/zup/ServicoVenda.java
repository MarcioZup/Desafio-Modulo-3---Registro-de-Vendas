package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {

    private static List<Venda> vendas = new ArrayList<>();


    //Método cadastrar Venda
    public static Venda cadastrarVenda(String cpf, String cpfVendedor, double valorASerPago, String dataDeRegistro) throws Exception {
        Cliente cliente = ServicoCliente.pesquisarClientePorCpf(cpf);
        Vendedor vendedor = ServicoVendedor.pesquisarVendedorPorCpf(cpfVendedor);
        Venda venda = new Venda(cliente, vendedor, valorASerPago, dataDeRegistro);
        vendas.add(venda);
        return venda;
    }

    //Método mostrar lista de Vendas
    public static void listarVendas() {
        if (vendas.size() == 0){
            System.out.println("Não existem Vendas cadastradas");
        }else {
            System.out.println(vendas.toString());
        }
    }

    //Método para pesquisar Vendas de um cliente específico através do CPF
    public static List<Venda> pesquisarCompraPeloCpfCliente(String cpf) {
        List<Venda> comprasDoCliente = new ArrayList<>();
        for (Venda referencia : vendas) {
            if (referencia.getCliente().getCpf().equals(cpf)) {
                comprasDoCliente.add(referencia);
            }
        }
        if (comprasDoCliente.size() > 0) {
            return comprasDoCliente;
        } else {
            System.out.println("Não foram encontradas Compras para esse Cliente!");
        }
        return comprasDoCliente;
    }

    //Método que lista todas Vendas de um Vendedor específico através do E-mail
    public static List<Venda> pesquisarVendaPeloEmailDoVendedor(String email) {
        List<Venda> vendasDoVendedor = new ArrayList<>();
        for (Venda referencia : vendas) {
            if (referencia.getVendedor().getEmail().equals(email)) {
                vendasDoVendedor.add(referencia);
            }
        }
        if (vendasDoVendedor.size() > 0){
            return vendasDoVendedor;
        }else{
            System.out.println("Nenhuma Venda registrada para esse Vendedor");
        }
        return vendasDoVendedor;
    }
}
