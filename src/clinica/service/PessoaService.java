package clinica.service;

import clinica.model.Pessoa;

public interface PessoaService {
		
		public boolean save(Pessoa p) throws Exception;
		
		public void update(Pessoa p);
		
		public void delete(Pessoa p);

		public void deleteById(int id);
		
		public Pessoa searchByCpf(String cpf);
}
