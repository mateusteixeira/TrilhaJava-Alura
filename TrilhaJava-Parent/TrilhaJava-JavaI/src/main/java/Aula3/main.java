package Aula3;
public class main {

	public static void main(String[] args) {

		Funcionario funcionarioJoao = new Funcionario();
		funcionarioJoao.setNomeFuncionario("Joao");
		funcionarioJoao.setSalario(1000);
		funcionarioJoao.setDepartamentoAlocado("TI");
		// funcionarioJoao.setDataCadastro(30,06,1992);
		funcionarioJoao.setRg("00000000");

		funcionarioJoao.mostra();
	}

}
