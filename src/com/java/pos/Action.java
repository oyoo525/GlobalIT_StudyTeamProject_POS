package com.java.pos;

import java.util.Scanner;

public class Action extends Menu {
	public Action(String name, int price) {
		super(name, price);
	}
	
	public static void main(String[] args) {

		Burger m1 = new Burger("햄버거메뉴",0);
		Drink m2 = new Drink("음료메뉴",0);
		Side m3 = new Side("사이드메뉴",0);
		Pay m4 = new Pay();
	
		String option1 = "";
		while(option1 != "4") {
			System.out.println("\tWelcome to \"골때리아\"\n******** 메뉴를 선택해주세요 ********");
			System.out.print("1.햄버거\t 2.음료\t3.사이드");	
			int sum = 0;
			if(!cart.isEmpty()) {
				System.out.println(" \t4.결제하기");
				System.out.println("************ 주문 내역 ************");
				int index = 0;
				
				for(Menu m : cart) {
					System.out.println(index+1 + "." + cart.get(index).getName() + "(" + cart.get(index).getPrice() + ")");
					sum += cart.get(index).getPrice();
					index++;
				}
				System.err.println("*** 결제할 금액은 " + sum + "원 입니다.***");
			}
			
			
			Scanner scan = new Scanner(System.in);
			option1 = scan.nextLine();
			
			switch(option1) {
				case "1" : case "1번" : case "햄버거" : case "버거" :
					option1 = "1";
					m1.choice();	
					break;
				case "2" : case "2번" : case "음료" :
					option1 = "2";
					m2.choice();
					break;	
				case "3" : case "3번" : case "사이드" : 
					option1 = "3";
					m3.choice();
					break;	
				case "4" : case "4번" : case "결제" : case "결제하기" :
					if(sum == 0) {
						System.err.println("메뉴를 선택하지 않았습니다.");
					} else {
						option1 = "4";
						m4.choice();
					}
					break;
				default :
					System.out.println("잘못 선택했습니다. 다시 선택해주세요.<action>");
			}	
			
			
		
		
		}
	
	
	
	
	
	
	
	
	
	}

}
