package br.com.abc.javacore.a11enum.classes;

public enum TipoCliente {
    //constat especif class body
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){
        public String getId() {
            return "B";
        }
    };

    private int tipo;
    private String nome;
    //Constructors
    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    //Getters
    public String getId(){
        return "A";
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
