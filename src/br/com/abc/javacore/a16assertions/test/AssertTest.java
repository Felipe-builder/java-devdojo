package br.com.abc.javacore.a16assertions.test;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-2000);
    }

    private static void calculaSalario(double salario){
        assert(salario > 0): "O salário não deve ser menor que zero, o salário veio: " + salario;
    }
}
