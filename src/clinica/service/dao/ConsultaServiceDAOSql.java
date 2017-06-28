package clinica.service.dao;

import clinica.model.Consulta;
import clinica.service.ConsultaService;

public class ConsultaServiceDAOSql extends OperacaoServiceDAOSql implements ConsultaService {

	@Override
	public boolean save(Consulta c) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Save ..." + this.getClass().getName());
		return false;
	}

	@Override
	public void update(Consulta c) {
		// TODO Auto-generated method stub
		System.out.println("Update ..." + this.getClass().getName());		
	}

	@Override
	public Consulta searchByCodigo(int codigo) {
		// TODO Auto-generated method stub
		System.out.println("SearchByCodigo ..." + this.getClass().getName());
		return null;
	}

}
