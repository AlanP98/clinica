package clinica.model;

import java.util.Date;
import java.util.LinkedList;

public class Consulta extends Operacao {
	
	private String diagnostico;
	private LinkedList <Medicamento> medicamentos;
	private Triagem triagem;
	
	public Consulta(int numero, Date data, Sala sala, Paciente paciente, Funcionario responsavel, String diagnostico, LinkedList<Medicamento> medicamentos, Triagem triagem) {
		super(numero, data, sala, paciente, responsavel);
		this.diagnostico = diagnostico;
		this.medicamentos = medicamentos;
		this.triagem = triagem;
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public LinkedList<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(LinkedList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Triagem getTriagem() {
		return triagem;
	}

	public void setTriagem(Triagem triagem) {
		this.triagem = triagem;
	}

	@Override
	public String toString() {
		return "Consulta [diagnostico=" + diagnostico + ", medicamentos=" + medicamentos + ", triagem=" + triagem
				+ ", data=" + dataHora + ", sala=" + sala + ", paciente=" + paciente + ", responsavel=" + responsavel + "]";
	}	
	
}
