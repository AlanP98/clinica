package clinica;

import java.util.Date;

public class Medico extends Funcionario {
	
	private int numCrm;
	private String especializacao;
	
	public Medico (String n, int cpf, int rg, char s, Date dataNasc, int id, double sal, Date dataIn, boolean ativo, int crm, String espec) {
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
}
