package com.java.pos;

public class Card extends Menu{

	public Card(String name, int price) {
		super(name, price);
	}

	@Override
	public void pay() {
		System.out.println("결제가 완료되었습니다");
		cart.clear();
	};
	
	
}
