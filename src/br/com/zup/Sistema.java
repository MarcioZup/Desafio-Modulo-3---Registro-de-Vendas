package br.com.zup;

import java.util.Scanner;

public class Sistema {

    //Método entrada de dados pelo usuário
    private static Scanner entradaDeDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

}
