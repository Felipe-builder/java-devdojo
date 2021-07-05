package br.com.abc.javacore.a12classesabstratas.classes;

public abstract class Pessoa {
    protected String nome;



    //metodos
    public abstract void imprime();

    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
