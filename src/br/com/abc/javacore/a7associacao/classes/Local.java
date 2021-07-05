package br.com.abc.javacore.a7associacao.classes;

public class Local {
    private String rua;
    private String bairro;

    //Construtors

    public Local() {
    }

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    //Métodos
    public void print(){
        System.out.println("==========LOCAL==========");
        System.out.println("Rua: "+this.rua);
        System.out.println("Bairro: "+this.bairro);
    }

    //Getters and Setters

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
