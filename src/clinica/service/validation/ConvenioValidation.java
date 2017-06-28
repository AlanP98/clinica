package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.Convenio;
import clinica.service.ConvenioService;
import clinica.service.dao.ConvenioServiceDAOSql;

public class ConvenioValidation implements ConvenioService {
	private ConvenioService service = new ConvenioServiceDAOSql();
	
	@Override
	public boolean save(Convenio c) throws Exception {
		if(!this.validateFields(c)) {
			throw new ValidationException();
		} else {
			service.save(c);
			return true;
		}
	}

	@Override
	public void update(Convenio c) throws Exception {
		if(!this.validateFields(c) || c.getId() <= 0) {
			throw new ValidationException();
		} else {
			service.update(c);
		}
	}

	@Override
	public void delete(Convenio c) throws Exception {
		service.delete(c);		
	}

	@Override
	public void deleteById(int id) throws Exception {
		if (id > 0) {
			service.deleteById(id);
		} else {
			throw new ValidationException();
		}
	}

	@Override
	public Convenio searchById(int id) throws Exception {
		if (id > 0) {
			return service.searchById(id);
		} else {
			throw new ValidationException();
		}
	}
	
	public boolean validateFields(Convenio c) {
		if (c.getMensalidade() < 0 || c.getNomeConvenio() == null || c.getTipoConvenio() == null) {
			return false;
		} else {
			return true;
		}
	}
	
}