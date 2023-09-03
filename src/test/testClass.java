package test;

import java.util.ArrayList;
import java.util.Scanner;

import com.java.pos.Burger;

public class testClass {

	public static void main(String[] args) {
		

		Burger burger1 = new Burger("물고기버거", 14000);
		Burger burger2 = new Burger("냉크리스피버거", 7600);
		Burger burger3 = new Burger("치약락스버거", 75000);
		Burger burger4 = new Burger("아프리칸버거", 29800);
		Burger burger5 = new Burger("구제버거", 100);
		ArrayList<Burger> burgers = new ArrayList<Burger>();
		
		System.out.println("Welcome to \"골때리아\"\n메뉴를 선택해주세요");
		
		Scanner home = new Scanner(System.in);
		System.out.println("1.햄버거\t 2.음료\t3.사이드");
		String option1 = home.next();


		
		
		home.close();
		
		
		
		
		
		
		
		
	}
}
