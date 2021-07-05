package br.com.abc.javacore.a8heranca.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco; //atribuição

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if (endereco != null)
        System.out.println("Endereço: " + endereco.getRua() + " " + endereco.getBairro());
        else
            System.out.println("Não houve endereço informado!");
    }

    // GETTERS AND SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
