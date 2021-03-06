package Aula3;
public class Funcionario {

	private String nomeFuncionario;
	private String departamentoAlocado;
	private double salario;
	private String rg;
	private Data dataCadastro;
	private static int idFuncionario;
	
	
	public Funcionario(String nomeFuncionario) {
		this();
		this.nomeFuncionario = nomeFuncionario;
	}

	public Funcionario() {
		idFuncionario++;
	}
	
	public static int getIdFuncionario() {
		return idFuncionario;
	}
	
	public void mostra(){
		System.out.println("Nome: "+getNomeFuncionario());
		System.out.println("Departamento Alocado: "+getDepartamentoAlocado());
		System.out.println("Sal�rio: "+getSalario());
		System.out.println("Rg: "+getRg());
		dataCadastro.getDataFormatada();
	}

	public void aumentaSalario(double aumento){
		setSalario(getSalario() + aumento);
	}
	
	public double calculaGanhoAnual(){
		return getSalario()*12;
	}
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getDepartamentoAlocado() {
		return departamentoAlocado;
	}

	public void setDepartamentoAlocado(String departamentoAlocado) {
		this.departamentoAlocado = departamentoAlocado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setDataCadastro(int dia, int mes, int ano) {
		if(this.dataCadastro == null){
			this.dataCadastro = new Data(dia, mes, ano);
		}
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}
	
	private void setMes(int mes) {
		dataCadastro.setMes(mes);
	}

	private void setDia(int dia) {
		dataCadastro.setDia(dia);
	}

	private void setAno(int ano) {
		dataCadastro.setAno(ano);
	}
	
	

}
