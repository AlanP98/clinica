package clinica.service;

import clinica.model.Funcionario;

public interface FuncionarioService extends PessoaService {

	public boolean save(Funcionario f) throws Exception;
	
	public void update(Funcionario f) throws Exception;
	
	public void delete(Funcionario f) throws Exception;
	
	public void deleteByCpf(String cpf) throws Exception;
	
	public Funcionario searchByCpf(String cpf) throws Exception;
	
	public Funcionario searchById(int id) throws Exception;

}
