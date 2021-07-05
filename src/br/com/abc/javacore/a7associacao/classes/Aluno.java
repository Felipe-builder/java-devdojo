package br.com.abc.javacore.a7associacao.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario; //atribuição

    //Construtors

    public Aluno() {
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos

    public void print(){
        System.out.println("==========ALUNO==========");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (seminario != null) { // protegendo o método de algum erro
            System.out.println("Seminário inscrito: " + this.seminario.getTitulo());
            return;
        } System.out.println("Aluno não está inscrito em nenhum seminário.");

    }


    //Getters and Setters

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
