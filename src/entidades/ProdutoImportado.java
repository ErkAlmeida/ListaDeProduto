package entidades;

public class ProdutoImportado extends Produto
{
	private Double taxaImportacao;
	
	public ProdutoImportado() 
	{
			}

	public ProdutoImportado(String nome, Double preco, Double taxaImportacao) 
	{
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(Double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	
	
}
