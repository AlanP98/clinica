package clinica.service.validation;

import java.util.LinkedList;

import clinica.exceptions.ValidationException;
import clinica.model.Consulta;
import clinica.model.Medicamento;
import clinica.service.ConsultaService;
import clinica.service.dao.ConsultaServiceDAOSql;

public class ConsultaValidation extends OperacaoValidation implements ConsultaService {
	ConsultaService service = new ConsultaServiceDAOSql();

	@Override
	public boolean save(Consulta c) throws Exception {
		if (!this.validateFields(c)) {
			throw new ValidationException();
		} else {
			service.save(c);
			return true;
		}
	}

	@Override
	public void update(Consulta c) throws Exception {
		if (!this.validateFields(c) || c.getCodigo() <= 0) {
			throw new ValidationException();
		} else {
			service.update(c);
		}
	}

	@Override
	public Consulta searchByCodigo(int codigo) throws Exception {
		if (codigo > 0) {
			return service.searchByCodigo(codigo);
		} else {
			throw new ValidationException();
		}
	}
	
	public boolean validateFields(Consulta c) {
		boolean retorno = super.validateFields(c);
		if (retorno == false) return retorno;
		TriagemValidation triagemV = new TriagemValidation();
		retorno = triagemV.validateFields(c.getTriagem());
		if (retorno == false) return retorno;
		if (c.getDiagnostico() == null) {
			return false;
		}
		
		MedicamentoValidation medicamentoV = new MedicamentoValidation();
		LinkedList<Medicamento> medicamentos = c.getMedicamentos();
		for (Medicamento m : medicamentos) {
			if (!medicamentoV.validateFields(m)) {
				return false;
			}
		}
		return retorno;
	}

}
