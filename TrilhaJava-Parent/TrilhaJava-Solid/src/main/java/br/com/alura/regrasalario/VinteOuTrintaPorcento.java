package br.com.alura.regrasalario;

import Aula3.Funcionario;

public class VinteOuTrintaPorcento implements RegraSalario {

	public double calculaSalarioPorRegra(Funcionario funcionario) {
        if(funcionario.getSalario() > 2000.0) {
            return funcionario.getSalario() * 0.75;
        }
        else {
            return funcionario.getSalario() * 0.85;
        }
    }
	
}
