package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.Medico;
import clinica.service.MedicoService;
import clinica.service.dao.MedicoServiceDAOSql;

public class MedicoValidation extends FuncionarioValidation implements MedicoService {
	private MedicoServiceDAOSql service = new MedicoServiceDAOSql();
	
	@Override
	public boolean save(Medico m) throws Exception {
		if (!this.validateFields(m)) {
			throw new ValidationException();
		} else {
			service.save(m);
			return true;
		}
	}

	@Override
	public void update(Medico m) throws Exception {
		if(!this.validateFields(m)) {
			throw new ValidationException();
		} else {
			service.update(m);
		}		
	}

	@Override
	public void delete(Medico m) throws Exception {
		service.delete(m);		
	}

	@Override
	public void deleteByCrm(int crm) throws Exception {
		if(crm > 0) {
			service.deleteByCrm(crm);
		} else {
			throw new ValidationException();
		}
	}

	@Override
	public Medico searchByCrm(int crm) throws Exception {
		if(crm > 0) {
			return service.searchByCrm(crm);
		} else {
			throw new ValidationException();
		}
	}
	
	public boolean validateFields(Medico m) {
		boolean retorno = super.validateFields(m);
		if (m.getNumCrm() <= 0 || m.getEspecializacao() == null) {
			retorno =  false;
		}
		return retorno;
	}

}