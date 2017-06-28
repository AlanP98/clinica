package clinica.model;

import java.util.Date;

public abstract class Operacao {
	
	protected int codigo;
	protected Date dataHora;
	protected Sala sala;
	protected Paciente paciente;
	protected Funcionario responsavel;
	
	public Operacao(int codigo, Date data, Sala sala, Paciente paciente, Funcionario responsavel) {
		this.codigo = codigo;
		this.dataHora = data;
		this.sala = sala;
		this.paciente = paciente;
		this.responsavel = responsavel;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int numero) {
		this.codigo = numero;
	}

	public Date getData() {
		return dataHora;
	}

	public void setData(Date data) {
		this.dataHora = data;
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
