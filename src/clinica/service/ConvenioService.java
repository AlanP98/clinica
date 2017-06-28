package clinica.service;

import clinica.model.Convenio;

public interface ConvenioService {

	public boolean save(Convenio c) throws Exception;
	
	public void update(Convenio c) throws Exception;
	
	public void delete(Convenio c) throws Exception;

	public void deleteById(int id) throws Exception;
	
	public Convenio searchById(int id) throws Exception;
	
}
