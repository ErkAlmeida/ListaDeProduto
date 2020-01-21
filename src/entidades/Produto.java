package entidades;

public class Produto {
	private String nome;
	private Double preco;

	public Produto() {

	}

	// Construtor com argumento
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
