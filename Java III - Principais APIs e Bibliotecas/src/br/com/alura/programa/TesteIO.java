package br.com.alura.programa;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TesteIO {

		public static void main(String[] args) throws IOException {
			InputStream inputStream = System.in;//new FileInputStream("leitura.txt");
//			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//		
			
			Scanner scanner = new Scanner(inputStream);
			String linhaDoteclado = scanner.nextLine();
			
			System.out.println("Capturei: "+linhaDoteclado);
			
			scanner.close();
		}
}
