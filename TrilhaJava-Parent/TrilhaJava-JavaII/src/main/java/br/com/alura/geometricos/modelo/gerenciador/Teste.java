package br.com.alura.geometricos.modelo.gerenciador;

import br.com.alura.geometricos.modelo.AreaCalculavel;
import br.com.alura.geometricos.modelo.Retangulo;

public class Teste {
	
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());
	}
}
