package clinica.service;

import clinica.model.Paciente;

public interface PacienteService extends PessoaService {

	public boolean save(Paciente p) throws Exception;
	
	public void update(Paciente p) throws Exception;
	
	public void delete(Paciente p) throws Exception;
	
	public Paciente searchByCpf(String cpf) throws Exception;

}
