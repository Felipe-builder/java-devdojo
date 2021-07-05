package br.com.abc.javacore.a2introducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5+5);
    }//soma dois valores
    public void subtraiDoisNumero() {
        System.out.println(5-5);
    }//subtrai dois valores

    /**
     * Multiplica dois valores: (num1 * num2) e então imprime na tela o resultado.
     * @param num1 parametro double.
     * @param num2 parametro int.
     */
    public void multiplicaDoisNumeros(double num1, int num2) {
        System.out.println(num1*num2);
    }

    /**
     * Faz a divisão entre dois valores double (num1 / num2) e retorna o resultado deste valor
     * @param num1 dividendo (double)
     * @param num2 divisor (double)
     * @return retorna o quociente da divisão se o num2(divisor) seja diferente de 0.
     */
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    /**
     * Faz a divisão entre dois valores (num1 / num2) caso num2 seja diferente de zero e imprime o resultado deste valor,
     * se o valor for igual a zero imprime uma mensagem informando erro.
     * @param num1 dividendo (double)
     * @param num2 divisor (double
     */
    public void imprimeDoisNumerosDivididos(double num1, double num2){
        if (num2 != 0) {
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Não é possível dividir por zero:");
    }

    /**
     * Indepente dos valores que entram o método 'altera' e imprime o valor definido 30 e 40, obs: esta lógica é somente
     * para fins explicativos não trata de forma correta um problema
     * @param num1 (ouble)
     * @param num2 (double)
     */
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois numeros: ");
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);
    }

    /**
     * Metodo que passa Array de int por um loop para fazer a soma dos valores dentro dele e imprime o resultado de todas
     * as somas.
     * @param numeros Array de int
     */
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    /**
     * Metodo que passa Array de int por um loop para fazer a soma dos valores dentro dele e imprime o resultado de todas
     *  as somas.
     * @param numeros varArgs.
     */
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
}
