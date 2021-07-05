package br.com.abc.javacore.a2introducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime() {
        System.out.println("-------------------------");
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(matricula);
        System.out.println(rg);
        this.nome = "Mariana";
        System.out.println(this.nome);
        System.out.println(nome);

    }
}
