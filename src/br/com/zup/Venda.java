package br.com.zup;

public class Venda {

    //Atributos
    private Cliente cliente;
    private Vendedor vendedor;
    private double valorASerPago;
    private String dataDeRegistro;

    //Métodos Construtores
    public Venda() {

    }

    public Venda(Cliente cliente, Vendedor vendedor, double valorASerPago, String dataDeRegistro) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valorASerPago = valorASerPago;
        this.dataDeRegistro = dataDeRegistro;
    }

    //Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n---Dados da Venda---");
        retorno.append("\nVendedor Responsável: " + vendedor);
        retorno.append("\nCliente: " + cliente);
        retorno.append("\nValor a ser pago: R$ " + valorASerPago);
        retorno.append("\nData de registro: " + dataDeRegistro);
        return retorno.toString();
    }
}
