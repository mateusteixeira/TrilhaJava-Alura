package br.com.alura.bancodados;

import br.com.alura.fiscal.Divida;
import br.com.alura.fiscal.Documento;

public interface ArmazenadorDeDividas {

	public void salva(Divida divida);
	public Divida carrega(Documento documentoCredor);
}
