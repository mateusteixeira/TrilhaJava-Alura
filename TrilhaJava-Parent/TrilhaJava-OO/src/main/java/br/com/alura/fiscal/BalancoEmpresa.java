package br.com.alura.fiscal;

import br.com.alura.bancodados.ArmazenadorDeDividas;
import br.com.alura.encapsulamento.Pagamento;

public class BalancoEmpresa {
	
		private ArmazenadorDeDividas bancoDeDados;
		
	    public BalancoEmpresa(ArmazenadorDeDividas armazenadorDeDividas) {
			this.bancoDeDados = armazenadorDeDividas;
		}

		public void registraDivida(String credor, String cnpjCredor, double valor) {
	        Divida divida = new Divida();
	        divida.setTotal(valor);
	        divida.setCredor(credor);
	        
	        Documento documento = new Cnpj(cnpjCredor);
	        
	        divida.setDocumento(documento);
	        bancoDeDados.salva(divida);
	    }

	    public void pagaDivida(Documento documento, Pagamento pagamento) {
	        Divida divida = bancoDeDados.carrega(documento);
	        if (divida != null) {
	            divida.registra(pagamento);
	        }
	    }

}
