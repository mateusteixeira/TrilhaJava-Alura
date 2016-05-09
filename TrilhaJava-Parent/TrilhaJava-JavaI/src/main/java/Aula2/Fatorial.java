package Aula2;

public class Fatorial {
	
	public static void main(String[] args) {
		
		for(long fatorialDe = 1; fatorialDe <= 40; fatorialDe++){
			System.out.println(fatorialDe + "! = "+ fatorial(fatorialDe));
		}
		
	}
	
	public static long fatorial(long num) {
		if (num <=1 )  return 1;
		else  return num * fatorial(num - 1);
	}
}
