package br.com.abc.javacore.a2introducaometodos.test;

import br.com.abc.javacore.a2introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumero();
        calc.multiplicaDoisNumeros(55.5, 5);
        System.out.println("divisão de dois números");
        System.out.println(calc.divideDoisNumeros(20,2));
        System.out.println("Imprimindo dois números divididos");
        calc.imprimeDoisNumerosDivididos(5,2);
        System.out.println("Continuando a exec");
        calc.alteraDoisNumeros(5, 3);
        int[] numeros = new int[]{1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
