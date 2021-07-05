package br.com.abc.javacore.a14polimorfismo.classes;

public class Vendedor extends Funcionario{
    private double totalVendas;

    // Constructors

    public Vendedor() {
    }

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }
    // Overriders
    @Override
    public void calculaPagamento(){
        this.salario += totalVendas * 0.05;
    }

    // Getters and Setters
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
