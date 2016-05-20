package br.com.alura.orcamento;

public class ItemOrcamento {
	
    private String nome;
    private double valor;

    public ItemOrcamento(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
      return valor;
    }

}
