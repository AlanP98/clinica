package clinica;

public class Convenio {

	private String nomeConvenio;
	private String tipoConvenio;
	private double mensalidade;
	
	public Convenio(String n, String tipo, double m){
		this.nomeConvenio = n;
		this.tipoConvenio = tipo;
		this.mensalidade = m;
	}

	public String getNomeConvenio() {
		return nomeConvenio;
	}

	public void setNomeConvenio(String nomeConvenio) {
		this.nomeConvenio = nomeConvenio;
	}

	public String getTipoConvenio() {
		return tipoConvenio;
	}

	public void setTipoConvenio(String tipoConvenio) {
		this.tipoConvenio = tipoConvenio;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	@Override
	public String toString() {
		return "Convenio [nomeConvenio=" + nomeConvenio + ", tipoConvenio=" + tipoConvenio + ", mensalidade="
				+ mensalidade + "]";
	}
	
}
