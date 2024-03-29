package br.com.abc.javacore.a7associacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios; // atribuição

    //Construtor

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    //Métodos
    public void print(){
        System.out.println("==========PROFESSOR==========");
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println("SEMINÁRIOS: ");
        //tratamento de possivel erro
        if (seminarios != null && seminarios.length != 0) {
            for (Seminario seminario: seminarios) {
                System.out.println(seminario.getTitulo());
            }
            return;
        }
        System.out.println("Não há seminários inscritos");
    }

    //Getters and Setters

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
