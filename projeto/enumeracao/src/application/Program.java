package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Funcionario;
import entities.enums.NivelContrato;




public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Insira o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.print("Insira o trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		
		System.out.print("Nivel: ");
		String nivelTrabalhador = sc.nextLine();
		
		System.out.print("Salario Base: ");
		Double salarioBase = sc.nextDouble();
		
		
		
		Funcionario funcionario = new Funcionario(nomeTrabalhador, NivelContrato.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		System.out.println("Quantos contratos o trabalhador terá? ");
		int n = sc.nextInt();
		for(int i = 1; i <=n; i++) {
			System.out.println("Insira o contrato #" + i);
			System.out.print("Date (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			
			System.out.print("Insira o valor por hora: ");
			Double valorporHora = sc.nextDouble();
			
			System.out.print("Duracao do contrato (horas): ");
			int horas = sc.nextInt();
			
			ContratoHora contrato = new ContratoHora(dataContrato, valorporHora, horas);
			funcionario.addContrato(contrato);
			
		}
		
		
		System.out.println("Insira o mes e o ano (MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Name: " + funcionario.getName());
		System.out.println("Departamento: " + funcionario.getDepartamento().getName());
		System.out.println("Ganho em: " + mesEAno + ": " + String.format("%.2f", funcionario.ganhoAno(ano, mes)));
		
	
		sc. close();
	}
}
