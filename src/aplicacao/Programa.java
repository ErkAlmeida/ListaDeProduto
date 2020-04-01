/**
 * 
 * 
 * */


package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException 
	{
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		System.out.print("Digite o numero de produtos:");
		int qtProduto = sc.nextInt();
		
		List<Produto> listProduto = new ArrayList<>();
		
		for(int w = 0 ; w < qtProduto; w++) 
		{
							
			//Sele�ao do tipo de produto
			
			System.out.println("Selecione a categoria do produto [C]-[U]-[i]");
			System.out.print("Digite Op��o: ");
			char opcao = sc.next().charAt(0);
		
			System.out.printf("Digite o #" + w);
			System.out.println();
		
			sc.nextLine();
			
			System.out.print("Digite o nome:");
			String nome = sc.nextLine();
			
			System.out.print("Digite Pre�o:");
			double preco = sc.nextDouble();
							
			if(opcao == 'i') 
			{
				System.out.print("Taxa importa��o: ");
				double taxaImportacao = sc.nextDouble();
				
				listProduto.add(new ProdutoImportado(nome,preco,taxaImportacao));
			}
			if(opcao == 'u') 
			{
				System.out.print("Data de Fabrica��o (DD/MM/YYYY): ");
					
				Date dataFabricacao = sdf.parse(sc.next());
					
				listProduto.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}
			if(opcao == 'c') 
			{
				listProduto.add(new Produto(nome, preco));
			}				
		}
		

		System.out.println();
	
		System.out.println("Tag de Pre�o:");
	
		for(Produto list: listProduto)
		{
			System.out.println(list);
		}
				
		sc.close();
	}

}
