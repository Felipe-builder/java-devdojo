package br.com.abc.javacore.a18strings.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto " + (fim-inicio) + "ms");

    }

    private static void concatString(int tan) {
        String string = "";
        for (int i = 0; i < tan; i++) {
            string += i;
        }
    }
}
