package br.com.alura.bancodados;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.fiscal.Divida;
import br.com.alura.fiscal.Documento;

public class BancoDeDados implements ArmazenadorDeDividas{
    private Map<Documento, Divida> dividasNoBanco = new HashMap<Documento, Divida>();

    public BancoDeDados(String endereco, String usuario, String senha) {
      System.out.println("Conectado!");
    }

    public void salva(Divida divida) {
      dividasNoBanco.put(divida.getDocumento(), divida);
    }

    public Divida carrega(Documento documentoCredor) {
      return dividasNoBanco.get(documentoCredor);
    }

    public void desconecta() {
      System.out.println("Desconectado!");
    }

  }