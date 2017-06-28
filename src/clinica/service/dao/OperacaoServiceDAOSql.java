package clinica.service.dao;

import clinica.model.Operacao;
import clinica.service.OperacaoService;

public class OperacaoServiceDAOSql implements OperacaoService {

	@Override
	public boolean save(Operacao o) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Save ..." + this.getClass().getName());
		return false;
	}

	@Override
	public void update(Operacao o) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Update ..." + this.getClass().getName());		
	}

	@Override
	public Operacao searchByCodigo(int codigo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SearchByCodigo ..." + this.getClass().getName());
		return null;
	}

}