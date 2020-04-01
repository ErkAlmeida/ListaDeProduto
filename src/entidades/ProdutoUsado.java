package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto
{
	private Date dateFabricacao;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dateFabricacao) 
	{
		super(nome, preco);
		this.dateFabricacao = dateFabricacao;
	}

	
	public Date getDateFabricacao() 
	{
		return dateFabricacao;
	}

	public void setDateFabricacao(Date dateFabricacao) 
	{
		this.dateFabricacao = dateFabricacao;
	}

	@Override
	public String toString() 
	{
		return nome +" (Usado) $"+preco+" (Data de Fabricação: "+ sdf.format(dateFabricacao)+")";
	}
}
