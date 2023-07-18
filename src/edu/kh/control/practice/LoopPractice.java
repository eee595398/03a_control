package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int input1 = sc.nextInt();
		if(input1<=1) {
			System.out.println("1이상의 숫자를 입력하세요");
		}
		else{
			for(int i=1;input1>i; --i) {
				System.out.print(input1 + i);
		}
			
		}
		

	}
	
}
