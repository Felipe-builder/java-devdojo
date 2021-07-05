package br.com.abc.javacore.a12classesabstratas.classes;

public class Gerente extends Funcionario{


    //construtor

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }
    //metodos
    @Override
    public void calculaSalario(){
        this.salario = salario + (salario*0.2);
    }

}
