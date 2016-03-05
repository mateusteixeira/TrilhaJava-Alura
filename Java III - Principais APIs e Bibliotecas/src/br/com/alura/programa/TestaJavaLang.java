package br.com.alura.programa;

public class TestaJavaLang {

	public static void main(String[] args) {

		String frase = "Socorram-me, subi no ônibus em Marrocos";
		
		for (int i = frase.length() - 1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}
		
	}

}
