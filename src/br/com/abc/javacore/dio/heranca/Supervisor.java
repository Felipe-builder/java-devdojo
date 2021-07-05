package br.com.abc.javacore.dio.heranca;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaImposto() {
        return salario * 0.001;
    }
}
