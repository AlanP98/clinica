package clinica.model;

public class Convenio {

	private int id;
	private String nomeConvenio;
	private String tipoConvenio;
	private double mensalidade;
	
	public Convenio(int id, String n, String tipo, double m){
		this.id = id;
		this.nomeConvenio = n;
		this.tipoConvenio = tipo;
		this.mensalidade = m;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
