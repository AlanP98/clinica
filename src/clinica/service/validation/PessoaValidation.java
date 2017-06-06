package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.*;
import clinica.service.PessoaService;

public class PessoaValidation implements PessoaService {
	
	private PessoaValidation() {
		super();
	}
	
	private static PessoaValidation service;
	
	public static PessoaValidation getInstance() {
		if (PessoaValidation.service == null) {
			PessoaValidation.service = new PessoaValidation(); 
		}
		return service;
	}
	
	//private PessoaService service = new PessoaServiceDAOSql();
	//private PessoaService service = new PessoaServiceDAOHibernate();

	@Override
	public boolean save(Pessoa p) throws Exception {
		boolean valid = p.getTipo().isValidCpfCnpj();
		if (valid) {
			System.out.println("Save ... cpf válido!");
			service.save(p);
			return true;
		} else {
			throw new ValidationException();
		}
	}

	@Override
	public void update(Pessoa p) {
		boolean valid = p.getTipo().isValidCpfCnpj();
		if (valid) {
			System.out.println("Update ... cpf válido!");
			service.update(p);
		} else {
			System.out.println("Update ... cpf inválido!");
		}
	}

	@Override
	public void delete(Pessoa p) {
		service.delete(p);
	}

	@Override
	public void deleteById(int id) {
		service.deleteById(id);
	}

	@Override
	public Pessoa searchByCpf(String cpf) {
		// TODO Auto-generated method stub
		return new Paciente("AP");
	}
	
}
