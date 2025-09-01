package br.inatel.test;

import org.junit.jupiter.api.Test;

import br.inatel.model.*;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    public void testFuncionarioDeclara(){

        Pessoa p1 = new Pessoa("Maverick", 33);
        Funcionario f = new Funcionario(p1, "Piloto", 90000);
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f.setSalario(-50000);});
        assertEquals("Salário não pode ser negativo", e.getMessage());
    }

    @Test
    public void testFuncionarioSemNome(){

        Pessoa p2 = new Pessoa("Rooster", 25);
        Funcionario f1 = new Funcionario(p2, "Piloto", 45000);
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f1.setNome("");});
        assertEquals("Nome não pode ser vazio", e.getMessage());
    }

    @Test
    public void testFuncionarioIdadeNegativa(){

        Pessoa p2 = new Pessoa("Rooster", 25);
        Funcionario f1 = new Funcionario(p2, "Piloto", 45000);
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f1.setIdade(-50);});
        assertEquals("Idade não pode ser negativa", e.getMessage());
    }
}