package clinica.service.dao;

import clinica.model.Enfermeiro;
import clinica.service.EnfermeiroService;

public class EnfermeiroServiceDAOSql extends FuncionarioServiceDAOSql implements EnfermeiroService {

	@Override
	public boolean save(Enfermeiro e) throws Exception {
		System.out.println("Save ..." + this.getClass().getName());
		return false;
	}

	@Override
	public void update(Enfermeiro e) throws Exception {
		System.out.println("Update ..." + this.getClass().getName());
	}

	@Override
	public void delete(Enfermeiro e) throws Exception {
		System.out.println("Delete ..." + this.getClass().getName());
	}

	@Override
	public void deleteByCoren(int coren) throws Exception {
		System.out.println("deleteByCoren ..." + this.getClass().getName());
	}

	@Override
	public Enfermeiro searchByCoren(int coren) throws Exception {
		System.out.println("searchByCoren ..." + this.getClass().getName());
		return null;
	}

}