package model;

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

    @Override
    public String toString() {
        return super.toString() + " - Compras: " + historicoCompras;
    }
}
