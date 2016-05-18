package br.com.alura.encapsulamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class Pagamento implements Iterable<Pagamento>{


	private Collection<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	private double valor;
	private MeioDePagamento forma;
	private String pagador;
	private String cnpjPagador;
	private Calendar data;
	
	public Pagamento() {
	}
	
	public Pagamento(double valor, String nomePagador, String cnpjPagador){
		this.valor = valor;
		this.pagador = nomePagador;
		this.cnpjPagador = cnpjPagador;
	}

	public Pagamento(double valor, MeioDePagamento forma) {
		this.valor = valor;
		this.forma = forma;
	}

	public double getValor() {
		return valor;
	}

	public MeioDePagamento getForma() {
		return forma;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Pagamento)) {
			return false;
		}
		Pagamento outro = (Pagamento) obj;
		if (forma != outro.forma || Double.doubleToLongBits(valor) != Double.doubleToLongBits(outro.valor)) {
			return false;
		}

		return true;
	}

	public String getPagador() {
		return pagador;
	}

	public void setPagador(String pagador) {
		this.pagador = pagador;
	}

	public String getCnpjPagador() {
		return cnpjPagador;
	}

	public void setCnpjPagador(String cnpjPagador) {
		this.cnpjPagador = cnpjPagador;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public void setForma(MeioDePagamento forma) {
		this.forma = forma;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valor += valor;
	}

	public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	
	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		paga(pagamento.getValor());
	}

	public Iterator<Pagamento> iterator() {
		return this.iterator();
	}

	
	

}