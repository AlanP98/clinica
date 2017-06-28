package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.Medicamento;
import clinica.service.MedicamentoService;
import clinica.service.dao.MedicamentoServiceDAOSql;

public class MedicamentoValidation implements MedicamentoService {
	private MedicamentoService service = new MedicamentoServiceDAOSql();
	
	@Override
	public boolean save(Medicamento m) throws Exception {
		if(!this.validateFields(m)) {
			throw new ValidationException();
		} else {
			service.save(m);
			return true;
		}
	}

	@Override
	public void update(Medicamento m) throws Exception {
		if(!this.validateFields(m) || m.getCodigo() <= 0) {
			throw new ValidationException();
		} else {
			service.update(m);
		}
	}

	@Override
	public void delete(Medicamento m) throws Exception {
		service.delete(m);
	}

	@Override
	public void deleteByCodigo(int codigo) throws Exception {
		if (codigo <= 0) {
			throw new ValidationException();
		} else {
			service.deleteByCodigo(codigo);
		}
	}

	@Override
	public Medicamento searchByCodigo(int codigo) throws Exception {
		if (codigo <= 0) {
			throw new ValidationException();
		} else {
			return service.searchByCodigo(codigo);
		}
	}
	
	public boolean validateFields(Medicamento m) {
		if(m.getNome() == null || m.getCompostos() == null) {
			return false;
		} else {
			return true;
		}
	}

}
