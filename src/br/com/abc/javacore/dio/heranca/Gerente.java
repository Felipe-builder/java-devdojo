package br.com.abc.javacore.dio.heranca;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaImposto() {
        return salario * 0.1;
    }


}
