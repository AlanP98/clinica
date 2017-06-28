package clinica.service;

import clinica.model.Triagem;

public interface TriagemService extends OperacaoService {

	public boolean save(Triagem t) throws Exception;
	
	public void update(Triagem t) throws Exception;
	
	public Triagem searchByCodigo(int codigo) throws Exception;

}
