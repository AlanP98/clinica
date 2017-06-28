package clinica.model;

import java.util.Date;

public class Paciente extends Pessoa {
	
	private String telefone;
	private String endereco;
	private Convenio convenio;
	private double peso;
	private double altura;
	private boolean ativo;

	public Paciente (String n, String cpf, String rg, Sexo s, Date dataNasc, String t, String end, Convenio conv, double p, double a, boolean ativo) {
		super(n, cpf, rg, s, dataNasc);
		this.telefone = t;
		this.endereco = end;
		this.convenio = conv;
		this.peso = p;
		this.altura = a;
		this.ativo = ativo;	
	}
	
	public Paciente(String nome) {
		super(nome);
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public boolean isValidTelefone(){
		return true;
	}

	@Override
	public String toString() {
		return "Paciente [telefone=" + telefone + ", endereco=" + endereco + ", convenio=" + convenio + ", peso=" + peso
				+ ", altura=" + altura + ", ativo=" + ativo + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg
				+ ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + "]";
	}
	
	
}
