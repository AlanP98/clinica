package clinica.service;

import clinica.model.Enfermeiro;;

public interface EnfermeiroService extends FuncionarioService {
	
	public boolean save(Enfermeiro e) throws Exception;
	
	public void update(Enfermeiro e) throws Exception;
	
	public void delete(Enfermeiro e) throws Exception;

	public void deleteByCoren(int coren) throws Exception;
	
	public Enfermeiro searchByCoren(int coren) throws Exception;

}
