package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Banco;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Insira o nome da conta: ");
		String name = sc.next();
		String escolha;
		
		System.out.println("Tem algum deposito inicial? y/n ");
		escolha = sc.next();
		Banco banco;
		if(escolha.equals("y")) {
			System.out.println("Insira o deposito inicial:  ");
			int depositoInicial = sc.nextInt();
			banco = new Banco(name, numeroConta, depositoInicial);
		}else{
			banco = new Banco(name, numeroConta);
			System.out.println("Conta: ");
			System.out.println("Nome da Conta: "+ banco.getName());
			System.out.println("Numero da Conta: "+ banco.getNumeroConta());
		}
		
		System.out.println("Conta: ");
		System.out.println("Nome da Conta: "+ banco.getName());
		System.out.println("Numero da Conta: "+ banco.getNumeroConta());
		System.out.println("Saldo Inicial: R$ " + banco.getDepositoInicial());
		System.out.println("Insira o valor de deposito: ");
		int deposito = sc.nextInt();
		banco.depositar(deposito);
		
		System.out.println("Saldo Atualizado: ");
		System.out.println("Conta: ");
		System.out.println("Nome da Conta: "+ banco.getName());
		System.out.println("Numero da Conta: "+ banco.getNumeroConta());
		System.out.println("Saldo: " + banco.getDepositoInicial());
		
		System.out.println("Insira a quantidade do saque: ");
		int saque = sc.nextInt();
		banco.saqueConta(saque);
		
		System.out.println("Saldo atualizado: ");
		System.out.println("Conta: ");
		System.out.println("Nome da Conta: "+ banco.getName());
		System.out.println("Numero da Conta: "+ banco.getNumeroConta());
		System.out.println("Saldo: " + banco.getDepositoInicial());
		
		
		
		
		
		sc.close();
	}

}
