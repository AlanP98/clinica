package clinica.service.validation;

import clinica.exceptions.ValidationException;
import clinica.model.Operacao;
import clinica.service.OperacaoService;
import clinica.service.dao.OperacaoServiceDAOSql;

public class OperacaoValidation implements OperacaoService {
	OperacaoService service = new OperacaoServiceDAOSql();
	
	@Override
	public boolean save(Operacao o) throws Exception {
		if (!this.validateFields(o)) {
			throw new ValidationException();
		} else {
			service.save(o);
			return true;
		}
	}

	@Override
	public void update(Operacao o) throws Exception {
		if (!this.validateFields(o) || o.getCodigo() <= 0) {
			throw new ValidationException();
		} else {
			service.update(o);
		}		
	}

	@Override
	public Operacao searchByCodigo(int codigo) throws Exception {
		if (codigo > 0) {
			return service.searchByCodigo(codigo);
		} else {
			throw new ValidationException();
		}
	}
	
	public boolean validateFields(Operacao o) {
		boolean retorno = true;
		SalaValidation salaV = new SalaValidation();
		retorno = salaV.validateFields(o.getSala());
		if (retorno == false) return retorno;
		PacienteValidation pacienteV = new PacienteValidation();
		retorno = pacienteV.validateFields(o.getPaciente());
		if (retorno == false) return retorno;
		FuncionarioValidation funcionarioV = new FuncionarioValidation();
		retorno = funcionarioV.validateFields(o.getResponsavel());
		if (retorno == false) return retorno;
		if (o.getData() == null) {
			return false;
		}
		return retorno;
	}

}
