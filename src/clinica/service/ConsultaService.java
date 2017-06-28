package clinica.service;

import clinica.model.Consulta;

public interface ConsultaService extends OperacaoService {
	
	public boolean save(Consulta c) throws Exception;
	
	public void update(Consulta c) throws Exception;
	
	public Consulta searchByCodigo(int numero) throws Exception;

}
