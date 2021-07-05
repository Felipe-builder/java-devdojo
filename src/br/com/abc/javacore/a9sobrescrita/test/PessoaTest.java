package br.com.abc.javacore.a9sobrescrita.test;

import br.com.abc.javacore.a9sobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina Tereza");
        p.setIdade(74);
        System.out.println(p);
    }
}
