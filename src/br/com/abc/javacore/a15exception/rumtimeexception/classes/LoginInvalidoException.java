package br.com.abc.javacore.a15exception.rumtimeexception.classes;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Usuário ou senha inválidas");
    }
}
