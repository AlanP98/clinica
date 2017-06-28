package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.Funcionario;
import clinica.service.FuncionarioService;
import clinica.service.dao.FuncionarioServiceDAOSql;

public class FuncionarioValidation extends PessoaValidation implements FuncionarioService {
	private FuncionarioService service = new FuncionarioServiceDAOSql();
	
	@Override
	public boolean save(Funcionario f) throws Exception {
		if (!this.validateFields(f)) {
			throw new ValidationException();
		} else {
			service.save(f);
			return true;
		}
	}

	@Override
	public void update(Funcionario f) throws Exception {
		if(!this.validateFields(f)) {
			throw new ValidationException();
		} else {
			service.update(f);
		}
	}

	@Override
	public void delete(Funcionario f) throws Exception {
		service.delete(f);
	}

	@Override
	public Funcionario searchByCpf(String cpf) throws Exception {
		return service.searchByCpf(cpf);
	}

	@Override
	public Funcionario searchById(int id) throws Exception {
		if(id == 0){
			throw new ValidationException();
		} else {
			return service.searchById(id);
		}
	}

	@Override
	public void deleteByCpf(String cpf) throws Exception {
		if(cpf == null){
			throw new ValidationException();
		} else {
			service.deleteByCpf(cpf);
		}		
	}
	
	public boolean validateFields(Funcionario f) {
		boolean retorno = super.validateFields(f);
		if(f.getSalario() < 0 || f.getDataInicio() == null) {
			retorno = false;
		}
		return retorno;
	}

}
