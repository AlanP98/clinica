package clinica.model;

import java.util.Date;

public class Triagem extends Operacao {
	
	private String sintomas;
	private String pressaoArterial;
	private int batimentosCardiacos;
	
	public Triagem(int numero, Date data, Sala sala, Paciente paciente, Funcionario responsavel, String sintomas, String pressao, int batimentos) {
		super(numero, data, sala, paciente, responsavel);
		this.sintomas = sintomas;
		this.pressaoArterial = pressao;
		this.batimentosCardiacos = batimentos;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getPressaoArterial() {
		return pressaoArterial;
	}

	public void setPressaoArterial(String pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}

	public int getBatimentosCardiacos() {
		return batimentosCardiacos;
	}

	public void setBatimentosCardiacos(int batimentosCardiacos) {
		this.batimentosCardiacos = batimentosCardiacos;
	}	
}
