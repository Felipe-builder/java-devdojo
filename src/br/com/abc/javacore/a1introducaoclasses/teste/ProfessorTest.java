package br.com.abc.javacore.a1introducaoclasses.teste;

import br.com.abc.javacore.a1introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Evandro Guedes";
        professor.matricula = "12519-Q";
        professor.rg = "3.525.553";
        professor.cpf = "084.194.204-91";

        Professor professor1 = new Professor();
        professor1.nome = "Pierluigi Piazzi";
        professor1.matricula = "42533-A";
        professor1.rg = "23.532.998-5";
        professor1.cpf = "099.205.098-23";

        System.out.println("DADOS DO PROFESSOR ");
        System.out.println("Nome: "+professor.nome);
        System.out.println("Matricula: "+professor.matricula);
        System.out.println("RG: "+professor.rg);
        System.out.println("CPF: "+professor.cpf);
        System.out.println("-----------------------------");
        System.out.println("DADOS DO PROFESSOR ");
        System.out.println("Nome: "+professor1.nome);
        System.out.println("Matricula: "+professor1.matricula);
        System.out.println("RG: "+professor1.rg);
        System.out.println("CPF: "+professor1.cpf);
    }
}
