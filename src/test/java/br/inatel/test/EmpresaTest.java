package br.inatel.test;

import br.inatel.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpresaTest{

    @Test
    public void testEmpresaDeclarada(){
        Empresa e = new Empresa("Empresa");
        assertEquals("Empresa", e.getNome());
    }

    @Test
    public void testSetNomeValido() {
        Empresa p = new Empresa("Samsung");
        p.setNome("Huawei");
        assertEquals("Huawei", p.getNome());
    }

    @Test
    public void testChecagemFuncionarios(){
        Empresa e1 = new Empresa("Huawei");
        Pessoa p1 = new Pessoa("Jonas", 33);
        Funcionario f1 = new Funcionario(p1, "QA", 2000, 127, "Integral");
        e1.adicionarFuncionario(f1);
        boolean check = e1.checagemFuncionarios();
        assertTrue(check);
    }

    @Test
    public void testChecagemClientes(){
        Empresa e1 = new Empresa("Huawei");
        Cliente c1 = new Cliente("José", 33);
        c1.adicionarCompra("Dell Inspiron 7020");
        e1.adicionarCliente(c1);
        boolean checar = e1.checagemCliente();
        assertTrue(checar);
    }
}