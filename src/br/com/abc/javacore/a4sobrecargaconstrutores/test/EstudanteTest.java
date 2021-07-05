package br.com.abc.javacore.a4sobrecargaconstrutores.test;

import br.com.abc.javacore.a4sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("12233", "Carlitos", new double[]{5,7,9}, "07/03/2020");
        est.imprime();
    }
}
