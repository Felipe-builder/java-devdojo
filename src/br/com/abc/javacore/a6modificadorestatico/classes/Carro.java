package br.com.abc.javacore.a6modificadorestatico.classes;

public class Carro {
    //Velocidade limite deve ser 240km/h
    private String nome;
    private double velcidadeMaxima;
    private static double velocidadeLimite = 240;

    //Construtor
    public Carro(String nome, double velcidadeMaxima) {
        this.nome = nome;
        this.velcidadeMaxima = velcidadeMaxima;
    }

    public Carro() {

    }

    //Metodos
    public void imprime() {
        System.out.println("-------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velcidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    // Getters and Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getVelcidadeMaxima(){
        return velcidadeMaxima;
    }

    public void setVelcidadeMaxima(double velcidadeMaxima){
        this.velcidadeMaxima = velcidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }
}
