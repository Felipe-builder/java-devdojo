package br.com.abc.javacore.a15exception.rumtimeexception.classes;

public class Leitor2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 2");
    }
}
