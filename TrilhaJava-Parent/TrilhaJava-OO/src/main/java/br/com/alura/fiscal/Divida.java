package br.com.alura.fiscal;

import br.com.alura.encapsulamento.Pagamento;

public class Divida {

	private double total;
	private double valorPago;
	private String credor;
	private Pagamento pagamento = new Pagamento();
	private Documento documento;
	
	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public double getValorPago() {
		return this.valorPago;
	}
	
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	public Documento getDocumento() {
		return documento;
	}
	
	public void validaDocumento(){
		if(documento != null){
			documento.ehValido();
		}
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	  public double valorAPagar() {
          return this.total - this.pagamento.getValor();
        }
	  
	  public void registra(Pagamento pagamento){
		  this.pagamento.registra(pagamento);
	  }
	
}
