package br.inatel.model;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;
    private int id;
    private String turno;

    public Funcionario(Pessoa pessoa, String cargo, double salario, int id, String turno) {
        super(pessoa.getNome(), pessoa.getIdade());
        this.cargo = cargo;
        this.salario = salario;
        this.id = id;
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
        if (cargo == null || cargo.isEmpty()) {
            throw new IllegalArgumentException("Funcionario precisa ter cargo");
        }
        if(cargo == "CEO"){
            throw new IllegalArgumentException("Este cargo já está ocupado");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        if (salario < 0)
            throw new IllegalArgumentException("Salário não pode ser negativo");
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
        if(id <= 0){
            throw new IllegalArgumentException("ID não pode ser menor ou igual à zero");
        }
        else if(id > 3000){
            throw new IllegalArgumentException("O limite de IDs é 3000");
        }
    }

    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
        if (turno == null || turno.isEmpty()) {
            throw new IllegalArgumentException("Funcionario precisa ter um turno definido");
        }
        else if (turno != "Integral" && turno != "Noturno"){
            throw new IllegalArgumentException("Defina um turno válido para o funcionário");
        }
    }

    @Override
    public String toString(){
        return super.toString() + " - Cargo:" + cargo + " - Salário: R$" + salario;
    }
}
