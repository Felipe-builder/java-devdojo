package br.com.abc.javacore.a5blocodeinicializacao.classes;

public class Cliente {
    // 1 - Alocado espaço na memória para o objeto que será criado.
    // 2 - Cada Atributo será criado e inicializado com seus valores default ou valores explícitos
    // 3 - Bloco de inicialização será executado
    // 4 - O construtor é executado
    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇÃO ");
        for (int i = 1; i <+ 100; i++) {
            parcelas[i-1] = i;
        }
    }

    public Cliente(){
        System.out.println("Dentro de construtor");
        for (int parcela: this.parcelas) {
            System.out.print(parcela + " ");
        }
    }

    //Getters and Setters
    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

    public int[] getParcelas() {
        return this.parcelas;
    }
}
