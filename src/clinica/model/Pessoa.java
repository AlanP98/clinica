package clinica.model;

import java.util.Date;

public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected int rg;
	protected char sexo;
	protected Date dataNascimento;
	protected TipoPessoa tipo;
	
	public Pessoa(String n, String cpf, int rg, char sexo, Date d) {
		this.nome = n;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.dataNascimento = d;
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public TipoPessoa getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + "]";
	}
}