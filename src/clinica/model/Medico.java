package clinica.model;

import java.util.Date;

public class Medico extends Funcionario {
	
	private int numCrm;
	private String especializacao;
	
	public Medico (String n, String cpf, String rg, Sexo s, Date dataNasc, int id, double sal, Date dataIn, boolean ativo, int crm, String espec) {
		super(n, cpf, rg, s, dataNasc, id, sal, dataIn, ativo);
		this.numCrm = crm;
		this.especializacao = espec;
	}

	public int getNumCrm() {
		return numCrm;
	}

	public void setNumCrm(int numCrm) {
		this.numCrm = numCrm;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	@Override
	public String toString() {
		return "Medico [numCrm=" + numCrm + ", especializacao=" + especializacao + ", id=" + id + ", salario=" + salario
				+ ", dataInicio=" + dataInicio + ", ativo=" + ativo + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg
				+ ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + "]";
	}
}
