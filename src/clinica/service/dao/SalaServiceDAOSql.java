package clinica.service.dao;

import clinica.model.Sala;
import clinica.service.SalaService;

public class SalaServiceDAOSql implements SalaService {

	@Override
	public boolean save(Sala s) throws Exception {
		System.out.println("INSERT INTO sala (andar, numero, descricao) "
				+ "VALUES ('" + s.getAndar() + "', '" + s.getNumero() + "', '" + s.getDescricao() + "')");
		return true;
	}

	@Override
	public void update(Sala s) throws Exception {
		System.out.println("UPDATE sala SET andar = '" + s.getAndar() + "', descricao = '" + s.getDescricao() + "' WHERE numero = '" + s.getNumero() + "'");
	}

	@Override
	public void delete(Sala s) throws Exception {
		System.out.println("DELETE FROM sala WHERE numero = '" + s.getNumero() + "';");
	}

	@Override
	public Sala searchById(int id) throws Exception {
		System.out.println("SELECT * FROM sala WHERE id = '" + id + "';");
		return null;
	}

}
