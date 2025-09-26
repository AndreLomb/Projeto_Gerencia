package br.inatel.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    private List<String> historicoCompras;

    public Cliente(String nome, int idade) {
        super(nome, idade);
        this.historicoCompras = new ArrayList<>();
    }

    public void adicionarCompra(String produto) {
        historicoCompras.add(produto);
    }

    public List<String> getHistoricoCompras() {
        return historicoCompras;
    }

    public int getNumeroCompras() {
        return historicoCompras.size();
    }

    public boolean temCompra(String produto) {
        return historicoCompras.contains(produto);
    }

    public boolean removerCompra(String produto) {
        return historicoCompras.remove(produto);
    }

    @Override
    public String toString() {
        return super.toString() + " - Compras: " + historicoCompras;
    }
}
