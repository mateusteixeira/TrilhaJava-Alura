package br.com.alura.programa;

import java.util.TreeSet;

public class TesteOrdenacaoTreeSet {
	
	public static void main(String args[]){
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		for(Integer i = 0; i < 1000;i++){
			treeSet.add(i);
		}
		
		for (Integer integer : treeSet.descendingSet()) {
			System.out.println(integer);
		}
		
		
	}

}
