package br.com.alura.filtroconta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.banco.modelo.Conta;

public class FiltroMesmoMes extends Filtro {
	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMesmoMes() {
		super();
	}

	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta c : contas) {
			if (c.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)
					&& c.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
				filtrada.add(c);
			}
		}

		filtrada.addAll(proximo(contas));
		return filtrada;
	}
}