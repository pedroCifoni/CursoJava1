package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Inserir;

public class Program {

	public static void main(String[] args) {
		List<Inserir> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o numero de funcionarios: ");
		int qntd = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= qntd; i++) {
			System.out.println("Funcionario # " + i + ":");
			System.out.println("Insira o nome do funcionario: ");
			String name = sc.nextLine();
			System.out.println("Insira o id do funcionario: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Insira o salario do funcionario: ");
			Double salary = sc.nextDouble();
			sc.nextLine();
			list.add(new Inserir(id, name, salary));		
				
			}
		
		System.out.println("Insira o id do funcionario que voce deseja o aumento de salario: ");
		int idAumento = sc.nextInt();
		boolean encontrou = false;
		for(Inserir obj : list) {
			if(obj.getId() == idAumento) {
				System.out.println("Insira a porcentagem do aumento: ");
				double porcentagem = sc.nextDouble();
				obj.aumentoSalario(porcentagem);
				encontrou = true;
				break;
			}
			
	
	}
		if(encontrou != true) {
			System.out.println("Esse id nao existe!");
		}
		
		
			
	
		
				System.out.println("Lista de funcionarios: ");
				for(Inserir func : list) {
					System.out.println("ID: " + func.getId()
					+ " Nome: " + func.getName() 
					+ "Salario: " + func.getSalary());
				}
						
		
		
		
		
		
		
		
		sc.close();
	}

}
