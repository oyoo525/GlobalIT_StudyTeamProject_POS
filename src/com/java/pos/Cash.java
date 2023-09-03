package com.java.pos;

import java.util.Scanner;

public class Cash extends Menu{

	public Cash(String name, int price) {
		super(name, price);
	}

	@Override
	public void pay() {
		System.out.println("지불할 금액을 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		int money = 0;
		money = scan.nextInt();
		int index = 0;
		int sum = 0;
		for(Menu m : cart) {
			sum += cart.get(index).getPrice();
		}
		if(sum-money == 0) {
			System.out.println("결제가 완료되었습니다.");
			cart.clear();
		} else if (sum-money < 0) {
			System.out.println("결제가 완료되었습니다.\n거스름돈 " + (money - sum) + "원 입니다.");
			cart.clear();
		} else if (sum-money > 0) {
			System.out.println("결제금액이 " +(sum - money)+ "부족합니다.");
			System.out.println("추가 지불하실 금액을 입력해주세요.");
			int low = sum-money;
			
			int add = 0;
			do {
				low = low-add;
				Scanner scan2 = new Scanner(System.in);
				add = scan2.nextInt();
				System.out.println("결제금액이 " +(low - add)+ "부족합니다.");
				System.out.println("추가 지불하실 금액을 입력해주세요.");

			} while (low == add && low < add); {
				if(low == add) {
					System.out.println("결제가 완료되었습니다.");
				} else if (low < add) {
					System.out.println("결제가 완료되었습니다.\n거스름돈 " + (add - low) + "원 입니다.");
				}
			}
			cart.clear();
		}
		
		  
		
	};
}
