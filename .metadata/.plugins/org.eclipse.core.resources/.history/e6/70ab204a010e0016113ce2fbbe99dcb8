package br.com.alura.programa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {
	
	  public static void main(String[] args) {
          System.out.println("Iniciando...");
          Collection<Integer> teste = new HashSet<Integer>();
          long inicioInsercao = System.currentTimeMillis();

          int total = 100000;

          for (int i = 0; i < total; i++) {
              teste.add(i);
          }
          long fimInsercao = System.currentTimeMillis();
          long inicioPesquisa = System.currentTimeMillis();
          for (int i = 0; i < total; i++) {
              teste.contains(i);
          }

          long fimPesquisa = System.currentTimeMillis();
          long tempoInsercao = fimInsercao - inicioInsercao;
          long tempoPesquisa = fimPesquisa - inicioPesquisa;
          System.out.println("Tempo gasto Insercao: " + tempoInsercao);
          System.out.println("Tempo gasto Pesquisa: " + tempoPesquisa);
      }

}
