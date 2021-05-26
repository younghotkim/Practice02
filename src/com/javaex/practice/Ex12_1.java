package com.javaex.practice;

import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		
		System.out.print("기호: ");
		String s = sc.nextLine();
		
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if (s=="+") {
			System.out.print("결과는: " + (float)(num1+num2));
		}
		
		else if (s.equals("-")) {
			System.out.print("결과는: " + (float)(num1-num2));
		}
		
		else if (s.equals("*")) {
			System.out.print("결과는: " + (float)(num1*num2));
		}
			
		else if (s.equals("/")) {
			
			if (num2==0)
				System.out.print("계산 할 수 없습니다.");
			
			else
				System.out.println("결과는: " + (float)(num1/num2));
			
			}
		
		
		else {
			System.out.print("계산 할 수 없는 기호입니다.");
		}
		
		
		
	
		
		sc.close();

	}

}
