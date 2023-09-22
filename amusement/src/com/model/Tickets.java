package com.model;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Tickets {
	private long ticket;
	private String category;
	private String holder;
	private Date date;
	private double price;
	private String avalabilty="Available";
	public Tickets(long ticket, String category, Date date, double price) {
		super();
		this.ticket = ticket;
		this.category = category;
		this.date = date;
		this.price = price;
	}
	public Tickets(long ticket, String category, String holder, Date date, double price) {
		super();
		this.ticket = ticket;
		this.category = category;
		this.holder = holder;
		this.date = date;
		this.price = price;
	}
	public long getTicket() {
		return ticket;
	}
	public void setTicket(long ticket) {
		this.ticket = ticket;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAvalabilty() {
		return avalabilty;
	}

	public void setAvalabilty(String avalabilty) {
		this.avalabilty = avalabilty;
	}
	SimpleDateFormat ft =  new SimpleDateFormat ("E yyyy.MM.dd");
	@Override
	public String toString() {
		return "Tickets [ticket: " + ticket + ", category: " + category + ", holder: " + holder + ", date: "+ ft.format(date)+ 
				", price: " + price + "Avalabilty: "+avalabilty+"]";
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
