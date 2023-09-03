package com.java.pos;

import java.util.ArrayList;
import java.util.Scanner;

public class Side extends Menu {
	
	public Side(String name, int price) {
		super(name,price);
	}

	@Override
	public void choice() {
		Side side1 = new Side("신발튀김", 45000);
		Side side2 = new Side("붐바스틱", 4600);
		Side side3 = new Side("달쉬브라운", 2000);
		
		ArrayList<Side> sides = new ArrayList<Side>();
		sides.add(side1);
		sides.add(side2);
		sides.add(side3);
		
		System.out.println("사이드를 선택하였습니다.");
		System.out.println("주문하실 사이드를 선택해주세요.");
		for(int i = 0; i<= sides.size()-1; i++) {
			System.out.printf("%d. %s\t%s원\n", (i+1), sides.get(i).getName(), sides.get(i).getPrice());
		}
		Scanner scan = new Scanner(System.in);
		String num3 = scan.next();
		switch(num3) {
			case "1" : case "1번" : case "신발" : case "신발튀김" : 
				cart.add(side1);
				break;
			case "2" : case "2번" : case "붐바스틱" : 
				cart.add(side2);	
				break;
			case "3" : case "3번" : case "달쉬브라운" : 
				cart.add(side3);	
				break;
			default : 
				System.err.println("잘못 선택했습니다. 다시 선택해 주세요.");
		}	
	}
}
