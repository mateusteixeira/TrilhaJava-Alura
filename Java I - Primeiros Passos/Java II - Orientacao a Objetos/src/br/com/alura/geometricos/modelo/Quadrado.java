package br.com.alura.geometricos.modelo;


public class Quadrado implements AreaCalculavel {

	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		return Math.pow(lado, lado);
	}

}
