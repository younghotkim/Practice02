package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키: ");
		
		int h = sc.nextInt();
		
		
		System.out.print("몸무게: ");
		
		int w = sc.nextInt();
		
		if ( w==(h-100)*0.9 ) {
			System.out.println("표준 입니다.");
		}
		
		else if ( w>(h-100)*0.9 ) {
			System.out.println("과체중 입니다.");
		}
		
		else {
			System.out.println("저체중 입니다.");
		}
		
		System.out.print("표준체중: " + (float)(h-100)*0.9);
		
		
		
		
		
		sc.close();

	}

}
