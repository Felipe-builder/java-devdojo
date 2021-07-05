package br.com.abc.javacore.a12classesabstratas.test;

import br.com.abc.javacore.a12classesabstratas.classes.Gerente;
import br.com.abc.javacore.a12classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Felipe", "299920-2", 2500, 15000);
        Gerente g = new Gerente("Iasmim", "182344-2", 7500);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(v);
        System.out.println("-----------------------");
        System.out.println(g);
    }
}
