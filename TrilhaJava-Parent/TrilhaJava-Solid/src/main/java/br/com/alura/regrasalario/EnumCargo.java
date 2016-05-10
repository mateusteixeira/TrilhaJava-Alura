package br.com.alura.regrasalario;

public enum EnumCargo {
	
	DESENVOLVEDOR(new DezOuQuinzePorcento()),
	DBA(new DezOuQuinzePorcento()),
	TESTER(new VinteOuTrintaPorcento());
	
	
	private RegraSalario regraSalario;
	
	private EnumCargo(RegraSalario regraSalario) {
		this.regraSalario = regraSalario;
	}
	
	public RegraSalario getRegraSalario() {
		return regraSalario;
	}

}
