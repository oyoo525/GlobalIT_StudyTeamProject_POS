package com.java.pos;

import java.util.ArrayList;
import java.util.Scanner;

public class Burger extends Menu {

	public Burger(String name, int price) {
		super(name, price);
	}
	
	
	@Override
	public void choice() {
		
		Burger burger1 = new Burger("물고기버거", 14000);
		Burger burger2 = new Burger("냉크리스피버거", 7600);
		Burger burger3 = new Burger("치약락스버거", 75000);
		Burger burger4 = new Burger("아프리칸버거", 29800);
		Burger burger5 = new Burger("구제버거", 100);
		
		ArrayList<Burger> burgers = new ArrayList<Burger>(); 
		burgers.add(burger1);
		burgers.add(burger2);
		burgers.add(burger3);
		burgers.add(burger4);
		burgers.add(burger5);
		
		System.out.println("햄버거를 선택하였습니다.");
		System.out.println("주문하실 버거를 선택해주세요.");
		for(int i = 0; i<= burgers.size()-1; i++) {
			System.out.printf("%d. %s\t%s원\n", (i+1), burgers.get(i).getName(), burgers.get(i).getPrice());
		}
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		switch(num1) {
			case "1" : case "1번" : case "물고기" : case "물고기버거" :
				cart.add(burger1);
				break;
			case "2" : case "2번" : case "냉크리스피" : case "냉크리스피버거" :
				cart.add(burger2);	
				break;
			case "3" : case "3번" : case "치약" : case "락스" : case "치약락스" : case "치약락스버거" :
				cart.add(burger3);	
				break;
			case "4" : case "4번" : case "아프리칸" : case "아프리칸버거" :
				cart.add(burger4);
				break;
			case "5" : case "5번" : case "구제" : case "구제버거" :
				cart.add(burger5);
				break;
			default : 
				System.err.println("잘못 선택했습니다. 다시 선택해 주세요.");
		}
		
		
		
	
	}






	
	
	
	
	
}
