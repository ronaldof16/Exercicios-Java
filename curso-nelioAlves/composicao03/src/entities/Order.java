package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enuns.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private List<Product> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
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
	
	public List<Product> getItems() {
		return items;
	}

	public void addItem(Product product) {
		items.add(product);
	}
	
	public void removeItem(Product product) {
		items.remove(product);
	}
	

}
