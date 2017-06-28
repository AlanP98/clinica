package clinica.service;

import clinica.model.Sala;

public interface SalaService {

	public boolean save(Sala s) throws Exception;
	
	public void update(Sala s) throws Exception;
	
	public void delete(Sala s) throws Exception;
	
	public Sala searchById(int id) throws Exception;

}
