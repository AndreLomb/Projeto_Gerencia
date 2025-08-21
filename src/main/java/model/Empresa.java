package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void checagemFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado na empresa " + nome);
        } else {
            System.out.println("Funcionários cadastrados na empresa " + nome + ":");
            funcionarios.forEach(System.out::println);
        }
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public void folhaDePagamento() {
        System.out.println("Folha de pagamento da empresa " + nome + ":");
        funcionarios.forEach(f -> System.out.println(f.getNome() + " - Salário: R$" + f.getSalario()));
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários da empresa " + nome + ":");
        funcionarios.forEach(System.out::println);
    }

    public void buscarFuncionarios(String nome){
        System.out.println("Buscando funcionários com o nome: " + nome);
        funcionarios.stream().filter(f -> f.getNome().equalsIgnoreCase(nome))
                .forEach(System.out::println);
    }

    public void listarClientes() {
        System.out.println("Clientes da empresa " + nome + ":");
        clientes.forEach(System.out::println);
    }
}