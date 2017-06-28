package clinica.testes;

import java.util.Date;
import java.util.LinkedList;

import clinica.exceptions.*;
import clinica.model.*;
import clinica.service.validation.*;

public class Teste {

	public static void main(String[] args) {
		Date date;
		Convenio convenio = new Convenio(1, "Unimed", "Total", 383.5);
		Paciente p = new Paciente("Alan Possamai", "037.546.990-75", "123", Sexo.M, date = new Date(1998, 3, 9), "99999999", "Av. Osvaldo Aranha", convenio, 95.8, 1.73, true); 
		Funcionario f = new Funcionario("João", "037.546.990-75", "123", Sexo.M, date, 131, 3100, date, true);
		Medico m = new Medico("Angélica", "03754699075", "123", Sexo.F, date = new Date(1971, 9, 4), 512, 5200.90, date = new Date(1996, 12, 23), true, 654342, "Pediatra");
		Sala s1 = new Sala(5, 52, "Procedimentos cirúrgicos");
		Triagem triagem = new Triagem(1, date = new Date(117, 4, 8), s1, p, f, "Febre aguda", "13:8", 84);
		LinkedList<Medicamento> medicamentos = new LinkedList<Medicamento>();
		Medicamento paracetamol = new Medicamento(1, "Paracetamol", "Glicose, Polissorbato 20, Cálcio hidratado");
		Medicamento busonid = new Medicamento(2, "Busonid", "Glicose, Budesonida, Celulose microcristalina");
		medicamentos.add(paracetamol);
		medicamentos.add(busonid);
		
		Consulta consulta = new Consulta(1, date = new Date(117, 4, 8), s1, p, f, "Sinusite crônica", medicamentos, triagem);
		
		ConsultaValidation consultaV = new ConsultaValidation();
		try {
			consultaV.save(consulta);
		} catch (ValidationException e) {
			System.out.println("Erro de validação!" + e.getMessage());
		} catch (PersistenceException e) {
			System.out.println("Erro de persistência!" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro inesperado!" + e.getMessage());
		}
		
		MedicamentoValidation medV = new MedicamentoValidation();
		try {
			medV.save(medicamentos.getFirst());
		} catch (ValidationException e) {
			System.out.println("Erro de validação!" + e.getMessage());
		} catch (PersistenceException e) {
			System.out.println("Erro de persistência!" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro inesperado!" + e.getMessage());
		}
		
		PacienteValidation pacienteV = new PacienteValidation();
		try {
			pacienteV.save(p);
		} catch (ValidationException e) {
			System.out.println("Erro de validação!" + e.getMessage());
		} catch (PersistenceException e) {
			System.out.println("Erro de persistência!" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro inesperado!" + e.getMessage());
		}
		
		FuncionarioValidation funcionarioV = new FuncionarioValidation();
		try {
			funcionarioV.save(f);
		} catch (ValidationException e) {
			System.out.println("Erro de validação!" + e.getMessage());
		} catch (PersistenceException e) {
			System.out.println("Erro de persistência!" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro inesperado!" + e.getMessage());
		}
		
		MedicoValidation medicoV = new MedicoValidation();
		try {
			medicoV.save(m);
		} catch (ValidationException e) {
			System.out.println("Erro de validação!" + e.getMessage());
		} catch (PersistenceException e) {
			System.out.println("Erro de persistência!" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro inesperado!" + e.getMessage());
		}
		
		SalaValidation salaV = new SalaValidation();
		try {
			salaV.save(s1);
		} catch (ValidationException e) {
			System.out.println("Erro de validação!" + e.getMessage());
		} catch (PersistenceException e) {
			System.out.println("Erro de persistência!" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro inesperado!" + e.getMessage());
		}
		
		TriagemValidation TriagemV = new TriagemValidation();
		try {
			TriagemV.save(triagem);
		} catch (ValidationException e) {
			System.out.println("Erro de validação!" + e.getMessage());
		} catch (PersistenceException e) {
			System.out.println("Erro de persistência!" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro inesperado!" + e.getMessage());
		}
		
//		System.out.println("\n============================================================================================");
//		System.out.println("RELATÓRIO DA CONSULTA:\n");
//		System.out.println("\nData da consulta: " + consulta.getData());
//		System.out.println("\nMédico responsável: " + m.getNome() + " | CRM: " + m.getNumCrm());
//		System.out.println("\nPaciente: " + p.getNome() + " | CPF: " + p.getCpf() + " | Tel: " + p.getTelefone());
//		System.out.println("\nSintomas: " + triagem.getSintomas());
//		System.out.println("\nDiagnóstico: " + consulta.getDiagnostico());
//		System.out.println("\nMedicamentos receitados: " + consulta.getMedicamentos());
//		System.out.println("\n============================================================================================");
		
	}

}
