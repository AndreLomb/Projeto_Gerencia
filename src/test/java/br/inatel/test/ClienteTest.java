package br.inatel.test;

import br.inatel.model.Cliente;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteTest {
    
    @Test
    public void testClienteDeclara(){
        Cliente c = new Cliente("Ricardo", 56);
        assertEquals("Ricardo", c.getNome());
    }
    
    @Test
    public void testHistoricoComprasVazio(){
        Cliente c = new Cliente("Maria", 30);
        assertTrue(c.getHistoricoCompras().isEmpty());
        assertEquals(0, c.getNumeroCompras());
    }

    @Test
    public void testAdicionarMultiplasCompras(){
        Cliente c = new Cliente("João", 25);
        c.adicionarCompra("Notebook");
        c.adicionarCompra("Mouse");
        c.adicionarCompra("Teclado");
        
        assertEquals(3, c.getNumeroCompras());
        assertTrue(c.getHistoricoCompras().contains("Notebook"));
        assertTrue(c.getHistoricoCompras().contains("Mouse"));
        assertTrue(c.getHistoricoCompras().contains("Teclado"));
    }

    @Test
    public void testContarCompras(){
        Cliente c = new Cliente("Ana", 28);
        assertEquals(0, c.getNumeroCompras());
        
        c.adicionarCompra("Produto1");
        assertEquals(1, c.getNumeroCompras());
        
        c.adicionarCompra("Produto2");
        c.adicionarCompra("Produto3");
        assertEquals(3, c.getNumeroCompras());
    }

    @Test
    public void testVerificarProdutoComprado(){
        Cliente c = new Cliente("Carlos", 35);
        c.adicionarCompra("Smartphone");
        c.adicionarCompra("Tablet");
        
        assertTrue(c.temCompra("Smartphone"));
        assertTrue(c.temCompra("Tablet"));
        assertFalse(c.temCompra("Laptop"));
        assertFalse(c.temCompra(""));
    }

    @Test
    public void testRemoverCompra(){
        Cliente c = new Cliente("Paula", 42);
        c.adicionarCompra("TV");
        c.adicionarCompra("Sound Bar");
        c.adicionarCompra("Blu-ray");
        
        assertEquals(3, c.getNumeroCompras());
        assertTrue(c.temCompra("TV"));
        
        // Remove compra existente
        assertTrue(c.removerCompra("TV"));
        assertEquals(2, c.getNumeroCompras());
        assertFalse(c.temCompra("TV"));
        
        // Tenta remover compra que não existe
        assertFalse(c.removerCompra("Xbox"));
        assertEquals(2, c.getNumeroCompras());
    }

    @Test
    public void testToStringCliente(){
        Cliente c = new Cliente("Lucas", 31);
        c.adicionarCompra("Livro Java");
        c.adicionarCompra("Curso Python");
        
        String resultado = c.toString();
        assertTrue(resultado.contains("Lucas"));
        assertTrue(resultado.contains("31 anos"));
        assertTrue(resultado.contains("Compras:"));
        assertTrue(resultado.contains("Livro Java"));
        assertTrue(resultado.contains("Curso Python"));
    }

    @Test
    public void testProdutosDuplicados(){
        Cliente c = new Cliente("Fernanda", 27);
        c.adicionarCompra("Café");
        c.adicionarCompra("Açúcar");
        c.adicionarCompra("Café"); // produto duplicado
        
        assertEquals(3, c.getNumeroCompras()); // deve contar produtos duplicados
        assertTrue(c.temCompra("Café"));
        assertTrue(c.temCompra("Açúcar"));
        
        // Remove apenas a primeira ocorrência do produto duplicado
        assertTrue(c.removerCompra("Café"));
        assertEquals(2, c.getNumeroCompras());
        assertTrue(c.temCompra("Café")); // ainda deve ter o segundo "Café"
        
        // Remove a segunda ocorrência
        assertTrue(c.removerCompra("Café"));
        assertEquals(1, c.getNumeroCompras());
        assertFalse(c.temCompra("Café")); // agora não deve mais ter "Café"
    }

}
