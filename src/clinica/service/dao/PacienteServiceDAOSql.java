package clinica.service.dao;

import clinica.model.Paciente;
import clinica.service.PacienteService;

public class PacienteServiceDAOSql extends PessoaServiceDAOSql implements PacienteService {

	@Override
	public boolean save(Paciente p) throws Exception {
		System.out.println("INSERT INTO paciente (nome, cpf, rg, sexo, dataNascimento, telefone, endereco, idConvenio, peso, altura, ativo) "
				+ "VALUES ('" + p.getNome() + "', '" + p.getCpf() + "', '" + p.getRg() + "', '" + p.getSexo() + "', '" + p.getDataNascimento() + "',  "
				+ "'" + p.getTelefone() + "', '" + p.getEndereco() + "', '" + p.getConvenio().getId() + "', '" + p.getPeso() + "', "
				+ "'" + p.getAltura() + "', '" + p.isAtivo() + "')");
		return true;
	}

	@Override
	public void update(Paciente p) {
		System.out.println("UPDATE pessoa SET nome = '" + p.getNome() + "', rg = '" + p.getRg() + "', sexo = '" + p.getSexo() + "', dataNascimento = '" + p.getDataNascimento() + "', "
				+ "telefone = '" + p.getTelefone() + "', endereco = '" + p.getEndereco() + "', idConvenio = '" + p.getConvenio().getId() + "', "
				+ "peso = '" + p.getPeso() + "', altura = '" + p.getAltura() + "', ativo = '" + p.isAtivo() + "' "
				+ "WHERE cpf = '" + p.getCpf() + "'");
	}

	@Override
	public void delete(Paciente p) {
		System.out.println("DELETE FROM pessoa WHERE cpf = '" + p.getCpf() + "';");
	}

	@Override
	public Paciente searchByCpf(String cpf) {
		System.out.println("SELECT * FROM paciente WHERE cpf = '" + cpf + "';");
		return null;
	}

}
