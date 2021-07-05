package br.com.abc.javacore.dio.heranca;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Lucas", 10000);
        Funcionario gerente1 = new Gerente("Lucas", 10000);
        Funcionario surpervisor = new Supervisor("Luara", 7500);
        Funcionario atendente = new Atendente("Joana", 4299);

        System.out.println(gerente.equals(gerente1));

        System.out.println(gerente);
        System.out.println(surpervisor);
        System.out.println(atendente);
    }
}
