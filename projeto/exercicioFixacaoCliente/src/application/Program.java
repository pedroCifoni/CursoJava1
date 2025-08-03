package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

      
        System.out.println("Entre com as infos do cliente: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Date (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.next());

        Client client = new Client(name, email, date);

     
        System.out.println("Insira outras informacoes: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.PROCESSING;

        Order order = new Order(new Date(), status, client);

        System.out.print("Quantos items nesse pedido? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("Insira o #" + i + " item:");
            System.out.print("Nome do produto: ");
            String productName = sc.nextLine();
            System.out.print("Preco do produto: ");
            double price = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();
            sc.nextLine(); 

            Product product = new Product(productName, price);
            OrderItem orderItem = new OrderItem(quantity, price, product);
            order.addItem(orderItem);
        }

  
        System.out.println();
        System.out.println("SUMÁRIO DO PEDIDO:");
        System.out.println(order);

        sc.close();
    }
}
