package clinica.service;

import clinica.model.Pessoa;

public interface PessoaService {
		
		public boolean save(Pessoa p) throws Exception;
		
		public void update(Pessoa p) throws Exception;
		
		public void delete(Pessoa p) throws Exception;
		
		public Pessoa searchByCpf(String cpf) throws Exception;
}
