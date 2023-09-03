package com.java.pos;

import java.util.ArrayList;
import java.util.Scanner;

public class Drink extends Menu {

	public Drink(String name, int price) {
		super(name, price);
	}

	@Override
	public void choice() {
		Drink drink1 = new Drink("발렌타인 30년산", 1000000);
		Drink drink2 = new Drink("민트초코에이드", 3500);
		Drink drink3 = new Drink("복숭아독차", 112000);
		Drink drink4 = new Drink("막걸리   ", 5000);
		
		ArrayList<Drink> drinks = new ArrayList<Drink>(); 
		drinks.add(drink1);
		drinks.add(drink2);
		drinks.add(drink3);
		drinks.add(drink4);
		
		System.out.println("음료를 선택하였습니다.");
		System.out.println("주문하실 음료를 선택해주세요.");
		for(int i = 0; i<= drinks.size()-1; i++) {
			System.out.printf("%d. %s\t%s원\n", (i+1), drinks.get(i).getName(), drinks.get(i).getPrice());
		}
		Scanner scan = new Scanner(System.in);
		String num2 = scan.next();
		switch(num2) {
			case "1" : case "1번" : case "발렌타인" : case "발렌타인 30년산" :
				cart.add(drink1);
				break;
			case "2" : case "2번" : case "민트" : case "민트초코" : case "에이드" : case "민트초코에이드" :
				cart.add(drink2);	
				break;
			case "3" : case "3번" : case "복숭아" : case "독차" : case "복숭아독차" :
				cart.add(drink3);	
				break;
			case "4" : case "4번" : case "막걸리" : 
				cart.add(drink4);
				break;
			default : 
				System.err.println("잘못 선택했습니다. 다시 선택해 주세요.");
		}
	}
}
