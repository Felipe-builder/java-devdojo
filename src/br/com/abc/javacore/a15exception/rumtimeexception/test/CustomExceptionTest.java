package br.com.abc.javacore.a15exception.rumtimeexception.test;

import br.com.abc.javacore.a15exception.rumtimeexception.classes.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar("Goku", "123");
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar(String usuarioTp, String senhaTp) throws LoginInvalidoException {
        String usuarioDb = "Goku";
        String senhaDb = "123";
        if (!usuarioTp.equals(usuarioDb) || !senhaTp.equals(senhaDb)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logado!");
        }
    }
}
