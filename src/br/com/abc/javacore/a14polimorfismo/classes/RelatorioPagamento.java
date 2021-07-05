package br.com.abc.javacore.a14polimorfismo.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento para funcionários genêricos");
        funcionario.calculaPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}
