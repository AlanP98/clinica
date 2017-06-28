package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.Triagem;
import clinica.service.TriagemService;
import clinica.service.dao.TriagemServiceDAOSql;

public class TriagemValidation extends OperacaoValidation implements TriagemService {
	TriagemService service = new TriagemServiceDAOSql();
	
	@Override
	public boolean save(Triagem t) throws Exception {
		if (!this.validateFields(t)) {
			throw new ValidationException();
		} else {
			service.save(t);
			return true;
		}
	}

	@Override
	public void update(Triagem t) throws Exception {
		if (!this.validateFields(t) || t.getCodigo() <= 0) {
			throw new ValidationException();
		} else {
			service.update(t);
		}
	}

	@Override
	public Triagem searchByCodigo(int codigo) throws Exception {
		if (codigo > 0) {
			return service.searchByCodigo(codigo);
		} else {
			throw new ValidationException();
		}
	}
	
	public boolean validateFields(Triagem t) {
		boolean retorno = super.validateFields(t);
		if (t.getBatimentosCardiacos() < 0 || t.getPressaoArterial() == null || t.getSintomas() == null) {
			retorno = false;
		}
		return retorno;
	}

}
