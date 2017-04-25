package clinica;

public class Medicamento {
	
	private String nome;
	private String compostos;
	
	public Medicamento(String nome, String compostos) {
		super();
		this.nome = nome;
		this.compostos = compostos;
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
