package br.com.abc.javacore.a4sobrecargaconstrutores.classes;

public class Estudante {
    //atributos da classe

    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;


    //construtor

    public Estudante(){}

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);//sobrecarga criada
        this.dataMatricula = dataMatricula;
    }

    // métodos

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota: notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
        System.out.println(this.dataMatricula);
    }

    //Getters and setters

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula(){
        return this.dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }


}
