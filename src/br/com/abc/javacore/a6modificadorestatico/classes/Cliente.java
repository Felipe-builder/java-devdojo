package br.com.abc.javacore.a6modificadorestatico.classes;

public class Cliente {
    // 0 - Bloco de inicialização estático é executado quando JVM carregar a classe(é executado apenas 1 vez)
    // 1 - Alocado espaço na memória para o objeto que será criado.
    // 2 - Cada Atributo será criado e inicializado com seus valores default ou valores explícitos
    // 3 - Bloco de inicialização será executado
    // 4 - O construtor é executado
    private static int[] parcelas;

    //blocos de inicialização
    static {
        parcelas = new int[100];
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇÃO ");
        for (int i = 1; i <+ 100; i++) {
            parcelas[i-1] = i;
        }
    }
    //construtores
    public Cliente(){
        System.out.println("Dentro de construtor");
        for (int parcela: Cliente.parcelas) {
            System.out.print(parcela + " ");
        }
    }

    //Getters and Setters
    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }

    public static int[] getParcelas() {
        return parcelas;
    }
}
