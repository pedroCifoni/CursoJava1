package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;


public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	SimpleDateFormat sdf = new SimpleDateFormat();
	
	public Order() {
		
	}
	
	public Order(List<OrderItem> items) {
		this.items = items;
	}
	

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	public Double total(){
		Double sum = 0.0;
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
		
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(client + "\n");
		sb.append("Itens do pedido:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
