package br.com.abc.javacore.a2introducaometodos.test;

import br.com.abc.javacore.a2introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "518.405.224.16";
        prof.matricula = "5174A";
        prof.nome = "Iasmim";
        prof.rg = "0151445-9";

        Professor prof2 = new Professor();
        prof2.nome = "Felipe";
        prof2.matricula = "8145C";
        prof2.cpf = "095.810.194-26";
        prof2.rg = "1948005-6";

        System.out.println("Dentro do professor test");
        System.out.println(prof.nome);
        prof.imprime();
        System.out.println(prof.nome);
        prof2.imprime();

    }
}
