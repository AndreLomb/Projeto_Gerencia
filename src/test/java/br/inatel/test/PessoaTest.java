package br.inatel.test;

import br.inatel.model.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void testePessoaDeclarada(){
        Pessoa p = new Pessoa("Jonas", 21);

        assertEquals("Jonas", p.getNome());
        assertEquals(21, p.getIdade());
    }

    @Test
    public void testSetNomeValido() {
        Pessoa p = new Pessoa("Ana", 25);
        p.setNome("Clara");
        assertEquals("Clara", p.getNome());
    }

    @Test
    public void testSetIdadeValida() {
        Pessoa p = new Pessoa("Carlos", 20);
        p.setIdade(35);
        assertEquals(35, p.getIdade());
    }

    @Test
    public void testSetNomeInvalido(){
        Pessoa p = new Pessoa("Jonas", 45);
        Exception e = assertThrows(IllegalArgumentException.class, () -> {p.setNome("");});
        assertEquals("Nome não pode ser vazio", e.getMessage());
    }
    @Test
    public void testSetIdadeInvalida(){
        Pessoa p = new Pessoa("Solèy", 22);
        Exception e = assertThrows(IllegalArgumentException.class, () -> {p.setIdade(-5);});
        assertEquals("Idade não pode ser negativa", e.getMessage());
    }
}