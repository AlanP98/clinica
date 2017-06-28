package clinica.service.dao;

import clinica.model.Convenio;
import clinica.service.ConvenioService;

public class ConvenioServiceDAOSql implements ConvenioService {

	@Override
	public boolean save(Convenio c) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Save ..." + this.getClass().getName());
		return false;
	}

	@Override
	public void update(Convenio c) {
		// TODO Auto-generated method stub
		System.out.println("Update ..." + this.getClass().getName());
	}

	@Override
	public void delete(Convenio c) {
		// TODO Auto-generated method stub
		System.out.println("Delete ..." + this.getClass().getName());
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		System.out.println("DeleteById ..." + this.getClass().getName());		
	}

	@Override
	public Convenio searchById(int id) {
		// TODO Auto-generated method stub
		System.out.println("SearchById ..." + this.getClass().getName());
		return null;
	}

}