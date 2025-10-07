package contaBancaria;

import java.util.Locale;
import java.util.Scanner;

import Excecoes.excecoesConta;
import entities.Conta;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Insira o titular da conta: ");
			String titular = sc.next();
			System.out.println("Insira o numero da conta: ");
			int numero = sc.nextInt();
			System.out.println("Insira o saldo inicial: ");
			Double saldo = sc.nextDouble();
			System.out.println("Insira o seu limite de saque: ");
			Double limitSaque = sc.nextDouble();
			Conta conta = new Conta(titular, numero, saldo, limitSaque);
			
			System.out.println("Insira a quantidade do saque: ");
			double quant = sc.nextDouble();
			conta.saque(quant);
			System.out.println("Saldo: " + conta.getSaldo());
		}
		catch(excecoesConta e) {
			System.out.println("Erro ao registrar conta!" + e.getMessage());
		}
		
		
		sc.close();
	}

}
