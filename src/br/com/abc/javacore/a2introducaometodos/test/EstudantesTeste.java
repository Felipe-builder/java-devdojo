package br.com.abc.javacore.a2introducaometodos.test;

import br.com.abc.javacore.a2introducaometodos.classes.Estudantes;

public class EstudantesTeste {
    public static void main(String[] args) {
        Estudantes aluno1 = new Estudantes();
        aluno1.init("Felipe", 25, new double[]{7, 8, 9.5});
        aluno1.imprima();
        aluno1.tirarMedia();
        System.out.println("O aluno está Aprovado? " + aluno1.isAprovado());

        Estudantes aluno2 = new Estudantes("Iasmim", 17, new double[]{9.6, 9.8, 10});
        aluno2.imprima();
        aluno2.tirarMedia();
        System.out.println("O aluno está Aprovado? " + aluno2.isAprovado());

    }
}
