package Aula3;
//Continuando exercício de arrays da aula 4
public class Empresa {
	private String nomeEmpresa;
	private String cnpj;
	private int numeroFuncionarios;
	private int posicaoLivreFuncionarios;
	private Funcionario[] funcionarios;

	public Empresa(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;	
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public int getPosicaoLivreFuncionarios() {
		return posicaoLivreFuncionarios;
	}

	public void setPosicaoLivreFuncionarios(int posicaoLivreFuncionarios) {
		this.posicaoLivreFuncionarios = posicaoLivreFuncionarios;
	}

	public void adicionaFuncionario(Funcionario funcionario, int posicaoAdicionar) {
		if (posicaoAdicionar == getPosicaoLivreFuncionarios() && posicaoAdicionar < getNumeroFuncionarios()) {
			funcionarios[posicaoAdicionar] = funcionario;
			setPosicaoLivreFuncionarios(posicaoAdicionar++);
		}
	}

}
