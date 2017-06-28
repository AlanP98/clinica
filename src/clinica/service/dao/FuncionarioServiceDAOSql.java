package clinica.service.dao;

import clinica.model.Funcionario;
import clinica.service.FuncionarioService;

public class FuncionarioServiceDAOSql extends PessoaServiceDAOSql implements FuncionarioService {

	@Override
	public boolean save(Funcionario f) throws Exception {
		System.out.println("INSERT INTO funcionario (nome, cpf, rg, sexo, dataNascimento, id, salario, dataInicio, ativo) "
				+ "VALUES ('" + f.getNome() + "', '" + f.getCpf() + "', '" + f.getRg() + "', '" + f.getSexo() + "', '" + f.getDataNascimento() + "',  "
				+ "'" + f.getId() + "', '" + f.getSalario() + "', '" + f.getDataInicio() + "', '" + f.isAtivo() + "')");
		return true;
	}

	@Override
	public void update(Funcionario f) throws Exception {
		System.out.println("UPDATE funcionario SET nome = '" + f.getNome() + "', cpf = '" + f.getCpf() + "', rg = '" + f.getRg() + "', sexo = '" + f.getSexo() + "', "
				+ "dataNascimento = '" + f.getDataNascimento() + "', salario = '" + f.getSalario() + "', dataInicio = '" + f.getDataInicio() + "', "
				+ "ativo = '" + f.isAtivo() + "' WHERE id = '" + f.getId() + "'");
	}

	@Override
	public void delete(Funcionario f) throws Exception {
		System.out.println("DELETE FROM funcionario WHERE id = '" + f.getId() + "';");
	}

	@Override
	public Funcionario searchByCpf(String cpf) {
		System.out.println("SELECT * FROM funcionario WHERE cpf = '" + cpf + "';");
		return null;
	}

	@Override
	public Funcionario searchById(int id) throws Exception {
		System.out.println("SELECT * FROM funcionario WHERE id = '" + id + "';");
		return null;
	}

	@Override
	public void deleteByCpf(String cpf) throws Exception {
		System.out.println("DELETE FROM funcionario WHERE cpf = '" + cpf + "';");
	}

}
