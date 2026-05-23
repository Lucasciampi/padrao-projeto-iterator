package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioRHTest {

    @Test
    void contarFuncionariosAtivosDepartamento() {
        Departamento departamento = new Departamento(
                new Funcionario("Funcionario 1", true),
                new Funcionario("Funcionario 2", true),
                new Funcionario("Funcionario 3", false),
                new Funcionario("Funcionario 4", true)
        );
        assertEquals(3, RelatorioRH.contarFuncionariosAtivosDepartamento(departamento));
    }

    @Test
    void contarTotalFuncionariosDepartamento() {
        Departamento departamento = new Departamento(
                new Funcionario("Funcionario 1", true),
                new Funcionario("Funcionario 2", true),
                new Funcionario("Funcionario 3", false),
                new Funcionario("Funcionario 4", true)
        );
        assertEquals(4, RelatorioRH.contarTotalFuncionariosDepartamento(departamento));
    }

}