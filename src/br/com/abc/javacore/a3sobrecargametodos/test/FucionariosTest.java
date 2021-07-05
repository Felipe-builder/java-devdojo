package br.com.abc.javacore.a3sobrecargametodos.test;

import br.com.abc.javacore.a3sobrecargametodos.classes.Funcionarios;

public class FucionariosTest {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("Alan","118.548.352.22", 7500, "89934-2");
//        funcionario.init("Alan","118.548.352.22", 7500, "89934-2");
        Funcionarios funcionario2 = new Funcionarios();
        funcionario2.init("Joao", "198.885.551-49", 8900, "84843-9");
        funcionario.imprime();
        funcionario2.imprime();
    }
}
