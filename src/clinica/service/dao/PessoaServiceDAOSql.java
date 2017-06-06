package clinica.service.dao;

import clinica.model.Paciente;
import clinica.model.Pessoa;
import clinica.service.PessoaService;

public class PessoaServiceDAOSql implements PessoaService {
	@Override
	public boolean save(Pessoa p) {
		System.out.println("Save ..." + this.getClass().getName());
		return true;
	}

	@Override
	public void update(Pessoa p) {
		System.out.println("Update ..." + this.getClass().getName());
	}

	@Override
	public void delete(Pessoa p) {
		System.out.println("Delete... " + this.getClass().getName());
	}

	@Override
	public void deleteById(int id) {
		System.out.println("DeleteByID... " + this.getClass().getName());
	}

	@Override
	public Pessoa searchByCpf(String cpf) {
		return new Paciente("Name");
	}
	
}
