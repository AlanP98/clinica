package clinica.model;

public class PessoaFisica extends TipoPessoa {
	
	private String cpf;
	private String rg;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public boolean isValidCpfCnpj() {
		try {
			String numbers = cpf.replace(".", "").replace("-", "").replace(" ", "");
			char[] arrayChar = numbers.toCharArray();
			
			if (arrayChar.length != 11) {
				return false;
			}
			
			int[] array = new int[11];
			for (int i = 0; i < arrayChar.length; i++) {
				array[i] = Character.getNumericValue(arrayChar[i]);
			}

			if (array[0] == array[1] && array[0] == array[2] && array[0] == array[3] && array[0] == array[4]
					&& array[0] == array[5] && array[0] == array[7] && array[0] == array[8] && array[0] == array[9]
					&& array[0] == array[10]) {
				return false;
			}

			int soma1 = (array[0] * 10) + (array[1] * 9) + (array[2] * 8) + (array[3] * 7) + (array[4] * 6)
					+ (array[5] * 5) + (array[6] * 4) + (array[7] * 3) + (array[8] * 2);
			int resto1 = (soma1 * 10) % 11;

			if (resto1 == 10) {
				resto1 = 0;
			}

			int soma2 = (array[0] * 11) + (array[1] * 10) + (array[2] * 9) + (array[3] * 8) + (array[4] * 7)
					+ (array[5] * 6) + (array[6] * 5) + (array[7] * 4) + (array[8] * 3) + (array[9] * 2);
			int resto2 = (soma2 * 10) % 11;

			if (resto2 == 10) {
				resto2 = 0;
			}

			if ((resto1 == array[9]) && (resto2 == array[10])) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
}
