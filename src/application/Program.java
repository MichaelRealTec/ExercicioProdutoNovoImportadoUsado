package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// exercicioProdutoNovoImportadoUsado
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		Double price;
		Date manufactureDate;
		Double customsFee;
		char tipo;
		
		System.out.print("Enter the number of products: ");
		int numProduct = sc.nextInt();
		
		for(int i = 0; i < numProduct; i++) {
			System.out.println("Product #" +(numProduct + 1)+ " data:");
			System.out.print("Commom, used or imported (c/u/i)? ");
			tipo = sc.next().charAt(0);
			while(tipo != 'c' && tipo != 'u' && tipo != 'i') {
				System.out.println("Error, character invalid!");
				System.out.print("Commom, used or imported (c/u/i)? ");
				tipo = sc.next().charAt(0);
			}
			if(tipo == 'u') {
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Price: ");
				price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				manufactureDate = new Date();
				
			} else if(tipo == 'i') {
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Price: ");
				price = sc.nextDouble();
				System.out.print("Customs fee: ");
				customsFee = sc.nextDouble();				
			} else {
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Price: ");
				price = sc.nextDouble();				
			}		
			
			
			
		}
		
		// Exibir o resultado na tela
		System.out.println("PRICE TAGS:");
		
		
		sc.close();
	}

}
