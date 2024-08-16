package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// exercicioProdutoNovoImportadoUsado
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		Double price;
		Date manufactureDate;
		char tipo;
		Double customsFee;
		Product product = new Product();
		Product productImported = new ImportedProduct();
		Product productUsed = new UsedProduct();

		System.out.print("Enter the number of products: ");
		int numProduct = sc.nextInt();

		for (int i = 0; i < numProduct; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Commom, used or imported (c/u/i)? ");
			tipo = sc.next().charAt(0);
			while (tipo != 'c' && tipo != 'u' && tipo != 'i') {
				System.out.println("Error, character invalid!");
				System.out.print("Commom, used or imported (c/u/i)? ");
				tipo = sc.next().charAt(0);
			}
			if (tipo == 'u') {
				sc.nextLine();
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Price: ");
				price = sc.nextDouble();

				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dataRecebida = sc.next();
				manufactureDate = sdf.parse(dataRecebida); // Do formato -> String para Date
				productUsed = new UsedProduct(name, price, manufactureDate);

			} else if (tipo == 'i') {
				sc.nextLine();
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Price: ");
				price = sc.nextDouble();
				System.out.print("Customs fee: ");
				customsFee = sc.nextDouble();
				productImported = new ImportedProduct(name, price, customsFee);
			} else {
				sc.nextLine();
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Price: ");
				price = sc.nextDouble();
				product = new Product(name, price);
			}
		}

		// Exibir o resultado na tela
		sc.nextLine();
		System.out.println();
		System.out.println("PRICE TAGS:");
		System.out.println(productImported.priceTag());
		System.out.println(product.priceTag());
		System.out.println(productUsed.priceTag());

		sc.close();
	}

}
