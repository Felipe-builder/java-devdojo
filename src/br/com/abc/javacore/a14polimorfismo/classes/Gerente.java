package br.com.abc.javacore.a14polimorfismo.classes;

public class Gerente extends Funcionario {

    private double participacaoNoLucro;


    // Constructors

    public Gerente() {
    }

    public Gerente(String nome, double salario, double participacaoNoLucro) {
        super(nome, salario);
        this.participacaoNoLucro = participacaoNoLucro;
    }

    // Overrides
    @Override
    public void calculaPagamento(){
        this.salario += participacaoNoLucro;
    }

    // Getters and Setters

    public double getParticipacaoNoLucro() {
        return participacaoNoLucro;
    }

    public void setParticipacaoNoLucro(double participacaoNoLucro) {
        this.participacaoNoLucro = participacaoNoLucro;
    }
}
