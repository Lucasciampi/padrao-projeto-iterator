package org.example;

import java.util.Iterator;

public class RelatorioRH {

    public static Integer contarFuncionariosAtivosDepartamento(Departamento departamento){
        int contador = 0;
        for (Funcionario funcionario : departamento) {
            if(funcionario.isAtivo()){
                contador++;
            }
        }
        return contador;
    }

    public static Integer contarTotalFuncionariosDepartamento(Departamento departamento){
        int contador = 0;
        for (Iterator f = departamento.iterator(); f.hasNext();) {
            contador++;
            f.next();
        }
        return contador;
    }

}
