package br.com.alura.fiscal;

public class Cpf implements Documento {
	
	private String cpf;
	
	public Cpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Boolean ehValido(){
		return true;
	}

	public String getValor() {
		return cpf;
	}

}
