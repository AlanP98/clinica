package clinica.service.dao;

import clinica.model.Triagem;
import clinica.service.TriagemService;

public class TriagemServiceDAOSql extends OperacaoServiceDAOSql implements TriagemService {

	@Override
	public boolean save(Triagem t) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Save ..." + this.getClass().getName());
		return false;
	}

	@Override
	public void update(Triagem t) {
		// TODO Auto-generated method stub
		System.out.println("Update ..." + this.getClass().getName());		
	}

	@Override
	public Triagem searchByCodigo(int codigo) {
		// TODO Auto-generated method stub
		System.out.println("SearchByCodigo ..." + this.getClass().getName());
		return null;
	}

}
