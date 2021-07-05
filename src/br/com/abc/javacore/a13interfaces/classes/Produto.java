package br.com.abc.javacore.a13interfaces.classes;

public class Produto implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;


    //construtor

    public Produto() {
    }

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    //metodos
    @Override
    public void calculaImposto(){
        this.precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    @Override
    public void calculaFrete(){
        this.valorFrete = this.preco / peso * 0.1;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal=" + precoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
