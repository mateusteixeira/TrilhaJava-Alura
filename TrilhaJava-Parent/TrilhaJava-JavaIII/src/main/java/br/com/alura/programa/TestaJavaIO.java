package br.com.alura.programa;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TestaJavaIO {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;// new FileInputStream("leitura.txt");
		// InputStreamReader isr = new InputStreamReader(is);

		OutputStream outputStream = new FileOutputStream("saida.txt");
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		// BufferedReader bufferedReader = new BufferedReader(isr);
		Scanner scanner = new Scanner(is);
		String readLine = scanner.nextLine();

		bufferedWriter.append(readLine);
		bufferedWriter.newLine();

		bufferedWriter.close();
		scanner.close();
	}

}
