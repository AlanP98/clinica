package clinica.model;

public class Medicamento {
	
	private int codigo;
	private String nome;
	private String compostos;
	
	public Medicamento(int codigo, String nome, String compostos) {
		this.codigo = codigo;
		this.nome = nome;
		this.compostos = compostos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCompostos() {
		return compostos;
	}

	public void setCompostos(String compostos) {
		this.compostos = compostos;
	}

	@Override
	public String toString() {
		return "Medicamento [nome=" + nome + ", compostos=" + compostos + "]";
	}	
	
}
