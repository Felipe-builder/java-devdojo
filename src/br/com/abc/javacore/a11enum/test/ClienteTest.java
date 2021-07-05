package br.com.abc.javacore.a11enum.test;

import br.com.abc.javacore.a11enum.classes.Cliente;
import br.com.abc.javacore.a11enum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(cliente);
    }
}
