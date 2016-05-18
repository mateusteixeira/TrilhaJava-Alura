package br.com.alura.fiscal;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.alura.encapsulamento.Pagamento;

public class RelatorioDeDividas {

	private Divida divida;

	public RelatorioDeDividas(Divida divida) {
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formatadorDeNumero) {
		System.out.println("Credor: " + divida.getCredor());
		System.out.println("Cnpj credor: " + divida.getDocumento());

		// agora utilizamos o formatadorDeNumero recebido como parâmetro do
		// método
		System.out.println("Valor a pagar: " + formatadorDeNumero.format(divida.getValorPago()));
		System.out.println("Valor total: " + formatadorDeNumero.format(divida.getTotal()));
	}
	
	 public static void main(String[] args) {
         Divida divida = new Divida();
         divida.setCredor("Credor 1");
         divida.setDocumento(new Cnpj("00.000.000/0001-01"));
         divida.setTotal(3000);

         Pagamento pagamento1 = new Pagamento();
         pagamento1.setValor(100);
         divida.registra(pagamento1);

     // temos uma formatação que usa os padrões brasileiros
     NumberFormat formatadorBrasileiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

     // temos agora uma formatação que usa os padrões dos Estados Unidos
         NumberFormat formatadorAmericano = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

     RelatorioDeDividas relatorio = new RelatorioDeDividas(divida);

     // geramos o relatório com o formatador brasileiro              
     relatorio.geraRelatorio(formatadorBrasileiro);

     // e agora com o formatador americano na mesma instância de RelatorioDeDivida          
     relatorio.geraRelatorio(formatadorAmericano);
     }
}