package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.Sala;
import clinica.service.SalaService;
import clinica.service.dao.SalaServiceDAOSql;

public class SalaValidation implements SalaService {
	private SalaService service = new SalaServiceDAOSql();

	@Override
	public boolean save(Sala s) throws Exception {
		if(!this.validateFields(s)) {
			throw new ValidationException();
		} else {
			service.save(s);
			return true;
		}
	}

	@Override
	public void update(Sala s) throws Exception {
		if(!this.validateFields(s) || s.getId() <= 0) {
			throw new ValidationException();
		} else {
			service.update(s);
		}
		
	}

	@Override
	public void delete(Sala s) throws Exception {
		if (s.getId() <= 0) {
			throw new ValidationException();
		} else {
			service.delete(s);
		}
	}

	@Override
	public Sala searchById(int id) throws Exception {
		if(id <= 0) {
			throw new ValidationException();
		} else {
			return service.searchById(id);
		}
	}
	
	public boolean validateFields(Sala s) {
		if(s.getAndar() <= 0 || s.getNumero() <= 0 || s.getDescricao() == null) {
			return false;
		} else {
			return true;
		}
	}

}
