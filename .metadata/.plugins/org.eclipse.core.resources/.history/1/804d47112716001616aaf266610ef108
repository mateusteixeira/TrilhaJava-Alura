package Aula3;

public class Data {
	
	private int mes;
	private int dia;
	private int ano;
	
	

	public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (! isDataViavel(dia, mes, ano)) {
            System.out.println("A data " + getDataFormatada() + " não existe!");
        }
    }

    private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0 || mes > 12) {
            return false;
        }

        int ultimoDiaDoMes = 31; // por padrao são 31 dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            if (ano % 4 == 0) {
                ultimoDiaDoMes = 29;
            } else {
                ultimoDiaDoMes = 28;
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }

        return true;
    }
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDataFormatada() {
		return (getDia()+"/"+getMes()+"/"+getAno());
	}
	
	

}
