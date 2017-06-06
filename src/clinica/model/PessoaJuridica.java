package clinica.model;

public class PessoaJuridica extends TipoPessoa {
	private String cnpj;
	private String razaoSocial;
	
		
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Override
	public boolean isValidCpfCnpj() {
		// TODO Auto-generated method stub
		return false;
	}
}
