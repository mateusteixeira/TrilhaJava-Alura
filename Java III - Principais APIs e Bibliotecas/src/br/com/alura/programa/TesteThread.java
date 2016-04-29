package br.com.alura.programa;

public class TesteThread {

	public static void main(String[] args) {

		ProgramaThread p1 = new ProgramaThread();
		p1.setId(1);

		Thread t1 = new Thread(p1);
		t1.start();

		ProgramaThread p2 = new ProgramaThread();
		p2.setId(2);

		Thread t2 = new Thread(p2);
		t2.start();

	}

}
