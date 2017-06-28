package clinica.testes;

import java.util.Date;
import clinica.service.validation.*;
import clinica.service.*;
import clinica.service.dao.PessoaServiceDAOSql;
import clinica.model.*;
import clinica.exceptions.*;

public class TesteValidation {
	
	private static PacienteValidation pacienteV = new PacienteValidation();
	private static ConvenioValidation convenioV = new ConvenioValidation();
	public static void main (String[] args) {
				
		Convenio convenio = new Convenio(1, "Unimed", "Total", 383.5);
		try {
			convenioV.save(convenio);
		} catch (ValidationException e) {
			System.out.println("Erro de validação!" + e.getMessage());
		} catch (PersistenceException e) {
			System.out.println("Erro de persistência!" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro inesperado!" + e.getMessage());
		}
		
		Date date;
		Paciente p = new Paciente("Alan Possamai", "037.546.990-75", "123", Sexo.M, date = new Date(1998, 3, 9), "99999999", "Av. Osvaldo Aranha", convenio, 95.8, 1.73, true); 
		try {
			pacienteV.save(p);
		} catch (ValidationException e) {
			System.out.println("Erro de validação!" + e.getMessage());
		} catch (PersistenceException e) {
			System.out.println("Erro de persistência!" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro inesperado!" + e.getMessage());
		}
	}
}
