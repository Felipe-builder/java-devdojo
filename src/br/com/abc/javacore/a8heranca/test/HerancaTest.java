package br.com.abc.javacore.a8heranca.test;

import br.com.abc.javacore.a8heranca.classes.Endereco;
import br.com.abc.javacore.a8heranca.classes.Funcionario;
import br.com.abc.javacore.a8heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Luana");
        Endereco end = new Endereco();

        p.setCpf("132.953.220-04");
        end.setBairro("Bairro 1");
        end.setRua("Rua 25");
        p.setEndereco(end);
        p.imprime();
        System.out.println("-----------------------");
        Funcionario f = new Funcionario("João");
        f.setCpf("065.992.014-22");
        f.setSalario(2350);
        f.setEndereco(end);
        f.imprime();
        System.out.println(f);

    }
}
