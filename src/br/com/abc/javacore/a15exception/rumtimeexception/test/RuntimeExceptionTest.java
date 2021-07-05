package br.com.abc.javacore.a15exception.rumtimeexception.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            divisao(10, 0);
            System.out.println("FIM");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void divisao(int num1,int num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de '0' para o num2");
        }
        int result = num1 / num2;
        System.out.println(result);
    }
}
