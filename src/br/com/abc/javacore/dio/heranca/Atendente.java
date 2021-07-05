package br.com.abc.javacore.dio.heranca;

public class Atendente extends Funcionario {
    public Atendente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaImposto() {
        return salario * 0.05;
    }
}
