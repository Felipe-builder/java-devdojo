package br.com.abc.javacore.a10modificadorfinal.classes;

public class Carro {
    private static final double VELOCIDADE_FINAL; //Constante de uma variável do tipo primitivo
    private final Comprador comprador = new Comprador(); // Constante de uma variavel do tipo reference
    private String nome;
    private String marca;

    //Blocos de inicialização
    static {
        VELOCIDADE_FINAL = 200;
    }

    @Override //sobrescrita
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    // Getters and setters

    public Comprador getComprador() {
        return comprador;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
