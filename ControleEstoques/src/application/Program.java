package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.print("Insira o produto: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantity = sc.nextInt();
				
		System.out.println("Produto: " + product);
		
		System.out.println("Insira a quantidade de produtos a serem adicionadas no estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Insira a quantidade de produtos a serem retirados do estoque: ");
		int removeQ = sc.nextInt();
		product.removeProducts(removeQ);
		
		System.out.println("Dados atualizados: " + product);
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
