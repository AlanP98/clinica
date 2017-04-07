package clinica;

import java.util.Date;

public class Funcionario extends Pessoa {
	
	protected int id;
	protected double salario;
	protected Date dataInicio;
	protected boolean ativo;
	
	public Funcionario (String n, int cpf, int rg, char s, Date dataNasc, int id, double sal, Date dataIn, boolean ativo) {
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
}
