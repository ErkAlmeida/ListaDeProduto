/**
 * 
 * 
 * */


package aplicacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de produtos:");
		int qtProduto = sc.nextInt();
		
		List<Produto> listProduto = new ArrayList<>();
		
		for(int i = 0 ; i < qtProduto; i++) 
		{
							
			//Seleçao do tipo de produto
			
			System.out.println("Selecione a categoria do produto [C]-[U]-[i]");
			char opcao = sc.next().charAt(0);
			
			System.out.printf("Digite o #" + i);
			System.out.println();
			
			
			sc.nextLine();
			
			System.out.println("Digite o nome:");
			String nome = sc.nextLine();
	
			
			System.out.println("Digite Preço:");
			double preco = sc.nextDouble();
						
			Produto produto = new Produto(nome, preco);
			
			//Selecionando a opção de produto
			
			
			listProduto.add(new Produto(nome,preco));
			
		}
			for(Produto prod: listProduto) {
				
				System.out.printf("");
				
			}		
		
		sc.close();
	}

}
