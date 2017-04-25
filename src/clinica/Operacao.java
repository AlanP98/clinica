package clinica;

import java.util.Date;

public abstract class Operacao {
	
	protected Date data;
	protected Sala sala;
	protected Paciente paciente;
	protected Funcionario responsavel;
	
	public Operacao(Date data, Sala sala, Paciente paciente, Funcionario responsavel) {
		super();
		this.data = data;
		this.sala = sala;
		this.paciente = paciente;
		this.responsavel = responsavel;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}		
}
