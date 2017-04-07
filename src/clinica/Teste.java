package clinica;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Date date = new Date(1998, 3, 9);
		Convenio convenio = new Convenio("Unimed", "Total", 383.5);
		Paciente p = new Paciente("Alan Possamai", 123, 123, 'M', date, 518242, "Av. Osvaldo Aranha", convenio, 95.8, 1.73, true); 
		Funcionario f = new Funcionario("João", 123, 123, 'M', date, 131, 3100, date, true);
		Medico m = new Medico("Angélica", 345, 345, 'F', date, 512, 5200.90, date, true, 654342, "Pediatra");
	}

}
