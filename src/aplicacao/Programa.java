package aplicacao;


import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de produtos:");
		int qtProduto = sc.nextInt();
		
		
		for(int i = 0 ; i < qtProduto; i++) 
		{
			
			System.out.print("Selecione a categoria do produto [C]-[U]-[i]");
			char opcao = sc.next().charAt(0);	
			
			System.out.printf("Digite o #" + i);
			System.out.println();
			
			sc.nextLine();
			
			System.out.println("Digite o nome:");
			String nome = sc.nextLine();
			
			System.out.println("Digite Pre�o:");
			double preco = sc.nextDouble();
			switch(opcao)
			{
				case 'u':
					Date data = new Date();
					
					System.out.print("Data de compra:");
					data = 
					
					break;
			}
			
			
			Produto produto = new Produto();
		}
		
		sc.close();
	}

}
