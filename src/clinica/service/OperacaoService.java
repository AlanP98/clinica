package clinica.service;

import clinica.model.Operacao;

public interface OperacaoService {

	public boolean save(Operacao o) throws Exception;
	
	public void update(Operacao o) throws Exception;
	
	public Operacao searchByCodigo(int codigo) throws Exception;

}
