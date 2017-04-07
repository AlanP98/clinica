package clinica;

import java.util.Date;

public class Enfermeiro extends Funcionario {
	
	private int numCoren;
	
	public Enfermeiro (String n, int cpf, int rg, char s, Date dataNasc, int id, double sal, Date dataIn, boolean ativo, int coren) {
		super(n, cpf, rg, s, dataNasc, id, sal, dataIn, ativo);
		this.numCoren = coren;
	}

	public int getNumCoren() {
		return numCoren;
	}

	public void setNumCoren(int numCoren) {
		this.numCoren = numCoren;
	}
}