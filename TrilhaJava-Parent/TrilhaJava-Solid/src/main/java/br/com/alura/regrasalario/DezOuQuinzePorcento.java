package br.com.alura.regrasalario;

import Aula3.Funcionario;

public class DezOuQuinzePorcento implements RegraSalario {

	public double calculaSalarioPorRegra(Funcionario funcionario) {
		if (funcionario.getSalario() > 3000.0)
			return funcionario.getSalario() * 0.8;
		else
			return funcionario.getSalario() * 0.9;
	}

}
