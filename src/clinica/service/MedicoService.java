package clinica.service;

import clinica.model.Medico;

public interface MedicoService extends FuncionarioService {

	public boolean save(Medico m) throws Exception;
	
	public void update(Medico m) throws Exception;
	
	public void delete(Medico m) throws Exception;

	public void deleteByCrm(int crm) throws Exception;
	
	public Medico searchByCrm(int crm) throws Exception;
	
}
