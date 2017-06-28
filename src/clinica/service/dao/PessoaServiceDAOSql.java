package clinica.service.dao;

import clinica.model.Pessoa;
import clinica.service.PessoaService;

public class PessoaServiceDAOSql implements PessoaService {
	@Override
	public boolean save(Pessoa p) {
		System.out.println("INSERT INTO pessoa (nome, cpf, rg, sexo, dataNascimento) "
				+ "VALUES ('" + p.getNome() + "', '" + p.getCpf() + "', '" + p.getRg() + "', '" + p.getSexo() + "', '" + p.getDataNascimento() + "')");
		return true;
	}

	@Override
	public void update(Pessoa p) {
		System.out.println("UPDATE pessoa SET nome = '" + p.getNome() + "', rg = '" + p.getRg() + "', sexo = '" + p.getSexo() + "', dataNascimento = '" + p.getDataNascimento() + "' WHERE cpf = '" + p.getCpf() + "'");
	}

	@Override
	public void delete(Pessoa p) {
		System.out.println("DELETE FROM pessoa WHERE cpf = '" + p.getCpf() + "';");
	}

	@Override
	public Pessoa searchByCpf(String cpf) {
		System.out.println("SELECT * FROM pessoa WHERE cpf = '" + cpf + "';");
		return null;
	}
	
}
