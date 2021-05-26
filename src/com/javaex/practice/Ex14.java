package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("수입을 입력해 주세요");
		System.out.print("수익: ");
		
		int p = sc.nextInt();
		
		if (p>=0 && p<1000) {
			System.out.print("소득세는 " + (float)p*0.09 + " 입니다.");	
		}
		
		else if (p>1000 && p<=4000) {
			System.out.print("소득세는 " + (float)(1000*0.09 + 0.18*(p-1000)) + " 입니다.");
		}
		
		else if (p>4000 && p<8000) {
			System.out.print("소득세는 " + (float)(1000*0.09 + 3000*0.18 + 0.27*(p-4000)) + " 입니다.");
		}
		
		else if (p>=8000) {
			System.out.print("소득세는 " + (float)(1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(p-8000)) + " 입니다.");
		}
		
		else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		
		sc.close();

	}

}
