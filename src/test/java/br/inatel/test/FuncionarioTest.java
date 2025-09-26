package br.inatel.test;

import org.junit.jupiter.api.Test;

import br.inatel.model.*;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    public void testFuncionarioDeclara(){

        Pessoa p1 = new Pessoa("Maverick", 33);
        Funcionario f = new Funcionario(p1, "Piloto", 90000, 70, "Integral");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f.setSalario(-50000);});
        assertEquals("Salário não pode ser negativo", e.getMessage());
    }

    @Test
    public void testFuncionarioSemNome(){

        Pessoa p2 = new Pessoa("Rooster", 25);
        Funcionario f1 = new Funcionario(p2, "Piloto", 45000, 26, "Integral");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f1.setNome("");});
        assertEquals("Nome não pode ser vazio", e.getMessage());
    }

    @Test
    public void testFuncionarioIdadeNegativa(){

        Pessoa p2 = new Pessoa("Rooster", 25);
        Funcionario f1 = new Funcionario(p2, "Piloto", 45000, 26, "Integral");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f1.setIdade(-50);});
        assertEquals("Idade não pode ser negativa", e.getMessage());
    }

    @Test
    public void testFuncionarioSemCargo(){
        Pessoa p3 = new Pessoa("Rusty", 30);
        Funcionario f3 = new Funcionario(p3, "Diretor", 90000, 4, "Noturno");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f3.setCargo("");});
        assertEquals("Funcionario precisa ter cargo", e.getMessage());
    }

    @Test
    public void testFuncionarioCEO(){
        Pessoa p4 = new Pessoa("Iguazu", 23);
        Funcionario f4 = new Funcionario(p4, "Estagiario", 3000, 5, "Noturno");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f4.setCargo("CEO");});
        assertEquals("Este cargo já está ocupado", e.getMessage());
    }

    @Test
    public void testFuncionarioTurno(){
        Pessoa p5 = new Pessoa("Carla", 50);
        Funcionario f5 = new Funcionario(p5, "Diretora", 40000, 349, "Integral");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f5.setTurno("");});
        assertEquals("Funcionario precisa ter um turno definido", e.getMessage());
    }

    @Test
    public void testFuncionarioTurnoValido(){
        Pessoa p6 = new Pessoa("Carla", 50);
        Funcionario f6 = new Funcionario(p6, "Diretora", 40000, 349, "Noturno");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f6.setTurno("Manha");});
        assertEquals("Defina um turno válido para o funcionário", e.getMessage());
    }

    @Test
    public void testFuncionarioIDValidoZero(){
        Pessoa p7 = new Pessoa("Michigan", 60);
        Funcionario f7 = new Funcionario(p7, "Chefe", 100000, 100, "Integral");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f7.setId(0);});
        assertEquals("ID não pode ser menor ou igual à zero", e.getMessage());
    }

    @Test
    public void testFuncionarioIDValidoNegativo(){
        Pessoa p7 = new Pessoa("Michigan", 60);
        Funcionario f7 = new Funcionario(p7, "Chefe", 100000, 100, "Integral");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f7.setId(-40);});
        assertEquals("ID não pode ser menor ou igual à zero", e.getMessage());
    }

    @Test
    public void testFuncionarioIDValido(){
        Pessoa p8 = new Pessoa("Michigan", 60);
        Funcionario f8 = new Funcionario(p8, "Chefe", 100000, 100, "Integral");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {f8.setId(9000);});
        assertEquals("O limite de IDs é 3000", e.getMessage());
    }
}