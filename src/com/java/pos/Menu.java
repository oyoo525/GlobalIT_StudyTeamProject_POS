package com.java.pos;

import java.util.ArrayList;

public class Menu implements Choice{

	private String name;
	private int price;
	
	static ArrayList<Menu> cart = new ArrayList<Menu>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public void choice() {
		System.out.println("주문시작");
	}
	@Override
	public void pay() {
		System.out.println("결제시작");
	};
	
}
