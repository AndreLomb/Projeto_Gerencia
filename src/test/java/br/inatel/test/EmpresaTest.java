package br.inatel.test;

import br.inatel.model.Empresa;
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
}