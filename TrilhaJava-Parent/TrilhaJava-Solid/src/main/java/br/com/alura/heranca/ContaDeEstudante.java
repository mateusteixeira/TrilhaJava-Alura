package br.com.alura.heranca;


public class ContaDeEstudante {

    private int milhas;
    
    private ManipuladorSaldo manipuladorSaldo;
    
    public ContaDeEstudante() {
    	manipuladorSaldo = new ManipuladorSaldo();
    }

    public void deposita(double valor) {
    	manipuladorSaldo.deposita(valor);
    	this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }

}
