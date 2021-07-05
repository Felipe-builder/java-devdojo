package br.com.abc.javacore.a10modificadorfinal.test;

import br.com.abc.javacore.a10modificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("kuririn");
        System.out.println(c.getComprador());
    }
}
