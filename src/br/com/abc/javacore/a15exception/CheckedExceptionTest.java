package br.com.abc.javacore.a15exception;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            criarArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
            System.out.println("Arquivo criado: "+file.createNewFile());
            System.out.println("Arquivo criado");
    }
}
