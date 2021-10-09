package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    public static List<Vendedor> vendedores = new ArrayList<>();

    //Método cadastrar Vendedor
    public static Vendedor cadastrarVendedorResponsavel(String nome, String cpf, String email) throws Exception{
        Vendedor vendedorResponsavel = new Vendedor(nome, cpf, email);
        vendedores.add(vendedorResponsavel);
        return vendedorResponsavel;
    }

    //Método mostrar lista de Vendedores cadastrados
    public static void listarVendedores(){
        System.out.println(vendedores.toString());
    }

    //Método para pesquisar Vendedor
    public static Vendedor pesquisarVendedorPorCpf(String cpf) throws Exception{
        for (Vendedor referencia: vendedores) {
            if (referencia.getCpf().equals(cpf)){
                return referencia;
            }
        }
        throw new Exception("Este Vendedor não está cadastrado.");
    }
}
