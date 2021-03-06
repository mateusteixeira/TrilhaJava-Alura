package br.com.alura.banco.gerenciadores;

import br.com.alura.banco.modelo.ContaCorrente;
import br.com.alura.banco.modelo.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
	  public static void main(String[] args) {

          GerenciadorDeImpostoDeRenda gerenciador = 
                      new GerenciadorDeImpostoDeRenda();

          SeguroDeVida sv = new SeguroDeVida();
          gerenciador.adiciona(sv);

          ContaCorrente cc = new ContaCorrente();
          cc.deposita(1000);
          gerenciador.adiciona(cc);

          System.out.println(gerenciador.getTotal());
      }
}
