package br.com.abc.javacore.a12classesabstratas.classes;

public class Vendedor extends Funcionario{
    private double totalVendas;

    //construtores

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    //metodos
    @Override
    public void calculaSalario(){
        this.salario = salario + (salario * 0.05);
    }

    //getters and setters

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
