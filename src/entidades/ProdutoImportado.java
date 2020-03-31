package entidades;

public class ProdutoImportado extends Produto
{
	private Double taxaImportacao;
	
	public ProdutoImportado() 
	{
		super();
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
	
	
	public Double precoTotal() 
	{
		return preco + taxaImportacao;
	}

	@Override
	public String toString() 
	{
		return nome +" (Usado) $"+preco+" (Taxa de importação $"+ taxaImportacao +")";
	}
}
