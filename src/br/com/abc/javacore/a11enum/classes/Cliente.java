package br.com.abc.javacore.a11enum.classes;

public class Cliente {
    /* Pode-se cirar enumeração dentro de uma classe ou fora, é preferivel fora.
    E não se pode criar enumeração dentro de um método

     */

    public enum TipoPagamento {
        AVISTA, APRAZO;
    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    // Contructor

    public Cliente() {
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                ", numero=" + tipoCliente.getTipo()+
                '}';
    }

//Getters and Setters

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
