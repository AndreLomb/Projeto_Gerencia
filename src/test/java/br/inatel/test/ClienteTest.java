package br.inatel.test;

import br.inatel.model.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteTest {

    @Test
    public void testClienteDeclara(){
        Cliente c = new Cliente("Ricardo", 56);
        assertEquals("Ricardo", c.getNome());
    }
}
