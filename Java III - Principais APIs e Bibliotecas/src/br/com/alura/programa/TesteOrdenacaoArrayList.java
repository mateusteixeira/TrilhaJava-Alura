package br.com.alura.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacaoArrayList {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();

		for (Integer i = 0; i < 1000; i++) {
			lista.add(i);
		}

		Collections.reverse(lista);
		
		for (Integer integer : lista) {
			System.out.println(integer);
		}
	}
}
