package clinica.service.dao;

import clinica.model.Medicamento;
import clinica.service.MedicamentoService;

public class MedicamentoServiceDAOSql implements MedicamentoService {

	@Override
	public boolean save(Medicamento m) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Save ..." + this.getClass().getName());
		return false;
	}

	@Override
	public void update(Medicamento m) {
		// TODO Auto-generated method stub
		System.out.println("Update ..." + this.getClass().getName());
	}

	@Override
	public void delete(Medicamento m) {
		// TODO Auto-generated method stub
		System.out.println("Delete ..." + this.getClass().getName());		
	}

	@Override
	public void deleteByCodigo(int codigo) {
		// TODO Auto-generated method stub
		System.out.println("DeleteByCodigo ..." + this.getClass().getName());		
	}

	@Override
	public Medicamento searchByCodigo(int codigo) {
		// TODO Auto-generated method stub
		System.out.println("SearchByCodigo ..." + this.getClass().getName());
		return null;
	}

}