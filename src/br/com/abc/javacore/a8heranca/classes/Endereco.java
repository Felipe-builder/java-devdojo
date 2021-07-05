package br.com.abc.javacore.a8heranca.classes;

public class Endereco {
    private String bairro;
    private String rua;

    @Override
    public String toString() { //sobrescrita de método
        return "Endereco{" +
                "bairro='" + bairro + '\'' +
                ", rua='" + rua + '\'' +
                '}';
    }


    // GETTERS AND SETTERS

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
