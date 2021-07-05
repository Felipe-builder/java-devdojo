package br.com.abc.javacore.a6modificadorestatico.test;


import br.com.abc.javacore.a6modificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("QUantidade de parcelas possíveis.");
        for (int parcela: c.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}
