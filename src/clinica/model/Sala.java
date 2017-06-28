package clinica.model;

public class Sala {
	
	private int id;
	private int andar;
	private int numero;
	private String descricao;
	
	public Sala(int andar, int numero, String descricao) {
		this.andar = andar;
		this.numero = numero;
		this.descricao = descricao;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Sala [andar=" + andar + ", numero=" + numero + ", descricao=" + descricao + "]";
	}	
	
}