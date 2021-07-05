package br.com.abc.javacore.a14polimorfismo.test;

import br.com.abc.javacore.a14polimorfismo.classes.Funcionario;
import br.com.abc.javacore.a14polimorfismo.classes.Gerente;
import br.com.abc.javacore.a14polimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.a14polimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Osvaldo", 5000, 2000); //
        Vendedor v = new Vendedor("Yuri", 2000, 20000); //
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("======================");
//        relatorio.relatorioPagamentoVendedor(v);
//        System.out.println("----------------------------");
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("======================");
        relatorio.relatorioPagamentoGenerico(v);
        System.out.println("----------------------------");
        //polimorfismo casting
        Funcionario f = g;
        System.out.println(f.getSalario());
        relatorio.relatorioPagamentoGenerico(f);/* erra ao fazer isto pois o objeto f é criado com o salario final
        de Gerente passado uma vez mais pela sobrescrita do método "calculaPagamento" desta classe e logo que chama o
        relatorio ele faz novamento a execução do metodo "calculaPagamento".
        */



    }
}
