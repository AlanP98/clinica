package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.Pessoa;
import clinica.service.PessoaService;
import clinica.service.dao.PessoaServiceDAOSql;

public class PessoaValidation implements PessoaService {
	private PessoaService service = new PessoaServiceDAOSql();

	public boolean save(Pessoa p) throws Exception {
		if(!this.validateFields(p)) {
			throw new ValidationException();
		} else {
			service.save(p);
			return true;
		}
	}

	@Override
	public void update(Pessoa p) throws Exception {
		if(!this.validateFields(p)) {
			throw new ValidationException();
		} else {
			service.update(p);
		}
	}

	@Override
	public void delete(Pessoa p) throws Exception {
		if(p.getCpf() == null){
			throw new ValidationException();
		} else if (p.isValidCpf()) {
			service.delete(p);
		} else {
			throw new ValidationException();
		}
	}

	@Override
	public Pessoa searchByCpf(String cpf) throws Exception {
		if(cpf == null){
			throw new ValidationException();
		} else {
			return service.searchByCpf(cpf);
		}
	}
	
	public boolean validateFields(Pessoa p) {
		if(!p.isValidCpf() || p.getNome() == null || p.getRg() == null || p.getSexo() == null || p.getDataNascimento() == null) {
			System.out.println("Pessoa inválida");
			return false;
		} else {
			return true;
		}
	}
}
