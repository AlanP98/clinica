package clinica.service.dao;

import clinica.model.Medico;
import clinica.service.MedicoService;

public class MedicoServiceDAOSql extends FuncionarioServiceDAOSql implements MedicoService {

	@Override
	public boolean save(Medico m) throws Exception {
		System.out.println("Save ..." + this.getClass().getName());
		return false;
	}

	@Override
	public void update(Medico m) {
		System.out.println("Update ..." + this.getClass().getName());	
	}

	@Override
	public void delete(Medico m) {
		System.out.println("Delete ..." + this.getClass().getName());		
	}

	@Override
	public void deleteByCrm(int crm) {
		System.out.println("DeleteByCrm ..." + this.getClass().getName());		
	}

	@Override
	public Medico searchByCrm(int crm) {
		System.out.println("searchByCrm ..." + this.getClass().getName());
		return null;
	}

}
