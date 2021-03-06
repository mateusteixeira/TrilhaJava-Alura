package br.com.alura.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import br.com.alura.banco.modelo.ContaPoupanca;

public class TestaCollections {

	public static void main(String[] args) {
		List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			ContaPoupanca contaPoupanca = new ContaPoupanca();
			contaPoupanca.setNumeroConta(random.nextInt(85));
			contaPoupanca.setSaldo(random.nextDouble());
			Integer nextInt = random.nextInt(50);
			contaPoupanca.setTitular(nextInt.toString());
			contas.add(contaPoupanca);
		}
		Collections.sort(contas);
		System.out.println("=======\n");
		for (ContaPoupanca contaPoupanca1 : contas) {

			System.out.println(contaPoupanca1.getNumeroConta());
		}
		System.out.println("=======\n");
		Collections.reverse(contas);
		for (ContaPoupanca contaPoupanca1 : contas) {

			System.out.println(contaPoupanca1.getNumeroConta());
		}

		Collections.shuffle(contas);
		System.out.println("=======\n");
		for (ContaPoupanca contaPoupanca1 : contas) {

			System.out.println(contaPoupanca1.getNumeroConta());
		}
		Collections.rotate(contas, 1);
		System.out.println("=======\n");
		for (ContaPoupanca contaPoupanca1 : contas) {

			System.out.println(contaPoupanca1.getNumeroConta());
		}
		
		System.out.println(contas);

	}
}
