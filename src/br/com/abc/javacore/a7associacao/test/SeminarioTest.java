package br.com.abc.javacore.a7associacao.test;


import br.com.abc.javacore.a7associacao.classes.Aluno;
import br.com.abc.javacore.a7associacao.classes.Local;
import br.com.abc.javacore.a7associacao.classes.Professor;
import br.com.abc.javacore.a7associacao.classes.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Felipe Santos", 25);
        Aluno aluno2 = new Aluno("Iasmim Siqueira", 18);

        Professor prof = new Professor("Yoda", "Engenharia de Software");
        Seminario sem = new Seminario("Como ser um excelente profissional");
        Local local = new Local("Bastião de Oliveira","São Bernado");

        aluno1.setSeminario(sem); //atribuir seminário ao aluno
        aluno2.setSeminario(sem); //atribuir seminário ao outro aluno

        sem.setProfessor(prof); //atribuir professor ao seminário
        sem.setLocal(local); // atribuir local ao seminário
        sem.setAlunos(new Aluno[] {aluno1, aluno2}); // atribuir alunos ao seminário

        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();

    }
}
