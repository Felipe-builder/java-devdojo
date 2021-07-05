package br.com.abc.javacore.a7associacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos; // atribuiçãpo
    private Professor professor; // atribuição
    private Local local; // atribuição

    //Construtors

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    //Métodos
    public void print() {
        System.out.println("==========Seminário==========");
        System.out.println("Titulo: "+this.titulo);
        if (professor != null)
            System.out.println("Professor: "+this.professor.getNome());
        else
            System.out.println("Não há professor inscrito");
        if (local != null)
            System.out.println("Local: Rua "+this.local.getRua() + " Bairro: " + this.local.getBairro());
        else
            System.out.println("Não há local Registrado");
        System.out.println("Alunos inscritos: ");
        if (alunos != null && alunos.length != 0) {
            for (Aluno aluno: alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Não há alunos Inscritos");
    }


    //Getters and Setters

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
