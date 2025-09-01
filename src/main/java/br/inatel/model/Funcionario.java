package br.inatel.model;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public Funcionario(Pessoa pessoa, String cargo, double salario) {
        super(pessoa.getNome(), pessoa.getIdade());
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        if (salario < 0)
            throw new IllegalArgumentException("Salário não pode ser negativo");
    }

    @Override
    public String toString(){
        return super.toString() + " - Cargo:" + cargo + " - Salário: R$" + salario;
    }
}
