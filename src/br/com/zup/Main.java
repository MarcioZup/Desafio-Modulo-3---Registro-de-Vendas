package br.com.zup;

public class Main {
    public static void main(String[] args) {
        boolean continuarExecutando = true;
        while (continuarExecutando) {
            try {
                continuarExecutando = Sistema.executar();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }


        }
    }
}