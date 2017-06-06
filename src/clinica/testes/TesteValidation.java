package clinica.testes;

import java.util.Date;
import clinica.service.validation.*;
import clinica.service.*;
import clinica.model.*;
import clinica.exceptions.*;

public class TesteValidation {
	
	private static PessoaService validator = PessoaValidation.getInstance();
	
	public static void main (String[] args) {	
		Date date;
		Convenio convenio = new Convenio("Unimed", "Total", 383.5);
		Paciente p = new Paciente("Alan Possamai", "037.546.990-75", 123, 'M', date = new Date(1998, 3, 9), 518242, "Av. Osvaldo Aranha", convenio, 95.8, 1.73, true); 
		
		try {
			validator.save(p);
		} catch (ValidationException e) {
			System.out.println("Erro de validação!");
		} catch (PersistenceException e) {
			System.out.println("Erro de validação!");
		} catch (Exception e) {
			System.out.println("Erro inesperado!");
		}
	}
}
