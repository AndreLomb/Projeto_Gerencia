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

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários da empresa " + nome + ":");
        funcionarios.forEach(System.out::println);
    }

    public void listarClientes() {
        System.out.println("Clientes da empresa " + nome + ":");
        clientes.forEach(System.out::println);
    }
}