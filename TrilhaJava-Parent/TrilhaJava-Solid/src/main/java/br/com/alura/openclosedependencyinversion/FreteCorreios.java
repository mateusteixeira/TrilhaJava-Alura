package br.com.alura.openclosedependencyinversion;

public class FreteCorreios implements Frete {

	public double calculaFretePara(String destino) {
	    if("SAO PAULO".equals(destino.toUpperCase())) {
            return 15;
        }
        return 30;
	}

}
