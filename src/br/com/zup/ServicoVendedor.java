package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    public static List<Vendedor> vendedores = new ArrayList<>();

    //Método para validar se E-mail tem @
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Este E-mail está inválido.");
        }
    }

    public static void verificarCpfExistentes(String cpf) throws Exception{
        for (Vendedor referencia : vendedores) {
            if (referencia.getCpf().equals(cpf)){
                throw new Exception("Este CPF já consta no cadastro de Vendedores. Operação NÃO realizada.");
            }
        }
    }

    //Método para verificar se o E-mail do Vendedor já está no cadastro
    public static void verificarEmailExistente(String email) throws Exception{
        for (Vendedor referencia : vendedores) {
            if (referencia.getEmail().equals(email)){
                throw new Exception("Este E-mail já consta no cadastro de Vendedores! Operação NÃO realizada");
            }
        }
    }

    //Método cadastrar Vendedor
    public static Vendedor cadastrarVendedorResponsavel(String nome, String cpf, String email) throws Exception{
        validarEmail(email);
        verificarEmailExistente(email);
        verificarCpfExistentes(cpf);
        Vendedor vendedorResponsavel = new Vendedor(nome, cpf, email);
        vendedores.add(vendedorResponsavel);
        return vendedorResponsavel;
    }

    //Método mostrar lista de Vendedores cadastrados
    public static void listarVendedores(){
        if (vendedores.size() == 0){
            System.out.println("Não existem Vendedores cadastrados");
        }else{
            System.out.println(vendedores.toString());
        }

    }

    //Método para pesquisar Vendedor por CPF
    public static Vendedor pesquisarVendedorPorCpf(String cpf) throws Exception{
        for (Vendedor referencia: vendedores) {
            if (referencia.getCpf().equals(cpf)){
                return referencia;
            }
        }
        throw new Exception("Este Vendedor não está cadastrado. Cadastre o Vendedor para prosseguir");
    }

    //Método para pesquisar Vendedor por E-mail
    public static Vendedor pesquisarVendedorPorEmail(String email) throws Exception{
        for (Vendedor referencia: vendedores) {
            if (referencia.getEmail().equals(email)){
                return referencia;
            }
        }
        throw new Exception("Este Vendedor não está cadastrado. Cadastre o Vendedor para prosseguir");
    }
}
