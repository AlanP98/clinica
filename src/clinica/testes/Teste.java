package clinica.testes;

import java.util.Date;
import java.util.LinkedList;

import clinica.model.*;

public class Teste {

	public static void main(String[] args) {
		Date date;
		Convenio convenio = new Convenio("Unimed", "Total", 383.5);
		Paciente p = new Paciente("Alan Possamai", "123.123.111-00", 123, 'M', date = new Date(1998, 3, 9), 518242, "Av. Osvaldo Aranha", convenio, 95.8, 1.73, true); 
		Funcionario f = new Funcionario("João", "123.123.111-00", 123, 'M', date, 131, 3100, date, true);
		Medico m = new Medico("Angélica", "123.123.111-00", 345, 'F', date = new Date(1971, 9, 4), 512, 5200.90, date = new Date(1996, 12, 23), true, 654342, "Pediatra");
		Sala s1 = new Sala(5, 52, "Procedimentos cirúrgicos");
		Triagem triagem = new Triagem(date = new Date(117, 4, 8), s1, p, f, "Febre aguda", "13:8", 84);
		LinkedList<Medicamento> medicamentos = new LinkedList<Medicamento>();
		Medicamento paracetamol = new Medicamento("Paracetamol", "Glicose, Polissorbato 20, Cálcio hidratado");
		Medicamento busonid = new Medicamento("Busonid", "Glicose, Budesonida, Celulose microcristalina");
		medicamentos.add(paracetamol);
		medicamentos.add(busonid);
		
		Consulta consulta = new Consulta(date = new Date(117, 4, 8), s1, p, f, "Sinusite crônica", medicamentos, triagem);
		
		System.out.println("\n============================================================================================");
		System.out.println("RELATÓRIO DA CONSULTA:\n");
		System.out.println("\nData da consulta: " + consulta.getData());
		System.out.println("\nMédico responsável: " + m.getNome() + " | CRM: " + m.getNumCrm());
		System.out.println("\nPaciente: " + p.getNome() + " | CPF: " + p.getCpf() + " | Tel: " + p.getTelefone());
		System.out.println("\nSintomas: " + triagem.getSintomas());
		System.out.println("\nDiagnóstico: " + consulta.getDiagnostico());
		System.out.println("\nMedicamentos receitados: " + consulta.getMedicamentos());
		System.out.println("\n============================================================================================");
		
	}

}
