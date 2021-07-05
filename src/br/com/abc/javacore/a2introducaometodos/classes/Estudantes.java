package br.com.abc.javacore.a2introducaometodos.classes;

public class Estudantes {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    //Construtores

    public Estudantes() {}

    public Estudantes(String nome, int idade, double[] notas) {
        init(nome, idade, notas);
    }

    public void init(String nome, int idade, double[] notas) {
        setNome(nome);
        setIdade(idade);
        setNotas(notas);

    }
    //Métodos

    /**
     * imprime os atributos da classe ESTUDANTES
     */
    public void imprima() {
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Idade: %s\n", this.idade);
        if (this.notas != null) {
            System.out.print("Notas: ");
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }
        }
    }

    /**
     * soma as notas do aluno e divide pela quantidade de notas, adquirindo a média e por sua vez verificando se a média
     * está acima ou a baixo de 6, caso sim adiciona 'aprovado=true';
     */
    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("ESSE ALUNO NÃO TEM NOTAS");
            return;
        }
        double sum = 0;
        for (double nota: this.notas) {
            sum += nota;
        }
        double media = sum/3.0;
        System.out.println("\nA média é: "+media);
        if (media > 6) {
            this.aprovado = true;
            System.out.println("APROVADO");
        } else {
            this.aprovado = false;
            System.out.println("REPROVADO");
        }
    }

    // getters and setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }
}
