package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reserva;
import model.exceptions.ExcecoesData;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Room number: ");
			int numero	 = sc.nextInt();
			System.out.println("Check-in date: (dd/MM/yyyy");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date: (dd/MM/yyyy");
			Date checkOut = sdf.parse(sc.next());
			
			Reserva reserva = new Reserva(numero, checkIn, checkOut);
			System.out.println("Reservas: " + reserva);
			
			System.out.println();
			System.out.println("Insira uma data para atualizar a reserva: ");
			System.out.println("Check-in date: (dd/MM/yyyy) ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date: (dd/MM/yyyy) ");
			checkOut = sdf.parse(sc.next());
			
			reserva.updateDates(checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
		
			
	}
	catch (ParseException e) {
		System.out.println("Formato invalido de data!");
	}
	catch(ExcecoesData e) {
		System.out.println("Erro na reserva! " + e.getMessage());
	}
		
	
	
	
	
	
	
	
	
	
		sc.close();
	}
	
}