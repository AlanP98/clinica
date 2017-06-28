package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.Paciente;
import clinica.service.PacienteService;
import clinica.service.dao.PacienteServiceDAOSql;

public class PacienteValidation extends PessoaValidation implements PacienteService {
	private PacienteService service = new PacienteServiceDAOSql();

	@Override
	public boolean save(Paciente p) throws Exception {
		if (!this.validateFields(p)) {
			throw new ValidationException();
		} else {
			service.save(p);
			return true;
		}	
	}

	@Override
	public void update(Paciente p) throws Exception {
		if(!this.validateFields(p)) {
			throw new ValidationException();
		} else {
			service.update(p);
		}
	}

	@Override
	public void delete(Paciente p) throws Exception {
		service.delete(p);
	}

	@Override
	public Paciente searchByCpf(String cpf) throws Exception {
		return service.searchByCpf(cpf);
	}
	
	public boolean validateFields(Paciente p) {
		boolean retorno = super.validateFields(p);
		if (retorno == false) return retorno; 
		ConvenioValidation c = new ConvenioValidation();
		retorno = c.validateFields(p.getConvenio());
		if(p.getTelefone() == null || p.getEndereco() == null || p.getPeso() == 0 || p.getAltura() == 0) {
			retorno = false;
		}
		return retorno;
	}

}