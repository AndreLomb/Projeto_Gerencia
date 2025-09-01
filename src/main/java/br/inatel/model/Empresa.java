package br.inatel.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;

    public Empresa(String nome) {
        setNome(nome);
        this.funcionarios = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public boolean checagemFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado na empresa " + nome);
            return false;
        } else {
            System.out.println("Funcionários cadastrados na empresa " + nome + ":");
            funcionarios.forEach(System.out::println);
            return true;
        }
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public boolean checagemCliente(){
        if(clientes.isEmpty()){
            System.out.println("Nenhum cliente passou pela empresa" + nome);
            return false;
        }
        else{
            System.out.println("Clientes que passaram pela empresa:");
            clientes.forEach(System.out::println);
            return true;
        }
    }

    public void buscarFuncionarios(String nome){
        System.out.println("Buscando funcionários com o nome: " + nome);
        funcionarios.stream().filter(f -> f.getNome().equalsIgnoreCase(nome))
                .forEach(System.out::println);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}