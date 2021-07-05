package br.com.abc.javacore.a15exception.rumtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimesExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("dentro do 1 Exception");
        }
        System.out.println("final do programa");

        try {
            talvezLanceException();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException, IOException {

    }
}
