package clinica.service;

import clinica.model.Medicamento;

public interface MedicamentoService {

	public boolean save(Medicamento m) throws Exception;
	
	public void update(Medicamento m) throws Exception;
	
	public void delete(Medicamento m) throws Exception;

	public void deleteByCodigo(int codigo) throws Exception;
	
	public Medicamento searchByCodigo(int codigo) throws Exception;

}
