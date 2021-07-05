package br.com.abc.javacore.a8heranca.classes;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome){
        super(nome);

    }

    @Override
    public String toString() { //sobrescrita de método
        return "Funcionario{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário: R$" + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu "+ super.nome + " recebi o pagamento de R$" + this.salario);
    }


    // GETTERS AND SETTERS

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
