package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.Enfermeiro;
import clinica.service.EnfermeiroService;
import clinica.service.dao.EnfermeiroServiceDAOSql;

public class EnfermeiroValidation extends FuncionarioValidation implements EnfermeiroService {
	private EnfermeiroService service = new EnfermeiroServiceDAOSql();
	
	@Override
	public boolean save(Enfermeiro e) throws Exception {
		if(super.save(e)){
			if(!this.validateFields(e)) {
				throw new ValidationException();
			} else {
				service.save(e);
				return true;
			}
		}
		return false;
	}

	@Override
	public void update(Enfermeiro e) throws Exception {
		super.update(e);
		if(!this.validateFields(e) || e.getId() <= 0) {
			throw new ValidationException();
		} else {
			service.update(e);
		}
	}

	@Override
	public void delete(Enfermeiro e) throws Exception {
		super.delete(e);
		service.delete(e);		
	}

	@Override
	public void deleteByCoren(int coren) throws Exception {
		if (coren > 0) {
			service.deleteByCoren(coren);
		} else {
			throw new ValidationException();
		}		
	}

	@Override
	public Enfermeiro searchByCoren(int coren) throws Exception {
		if (coren > 0) {
			return service.searchByCoren(coren);
		} else {
			throw new ValidationException();
		}		
	}

	public boolean validateFields(Enfermeiro e) {
		boolean retorno = super.validateFields(e);
		if(e.getNumCoren() <= 0) {
			retorno = false;
		}
		return retorno;
	}
}