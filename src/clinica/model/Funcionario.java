package clinica.model;

import java.util.Date;

public class Funcionario extends Pessoa {
	
	protected int id;
	protected double salario;
	protected Date dataInicio;
	protected boolean ativo;
	
	public Funcionario (String n, String cpf, String rg, Sexo s, Date dataNasc, int id, double sal, Date dataIn, boolean ativo) {
		super(n, cpf, rg, s, dataNasc);
		this.id = id;
		this.salario = sal;
		this.dataInicio = dataIn;
		this.ativo = ativo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", salario=" + salario + ", dataInicio=" + dataInicio + ", ativo=" + ativo
				+ ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + "]";
	}
	
}
