package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		/*
		 키보드로 2개의 정수형 데이터를 입력받아
		 두 수가 모두 1부터 9까지의 수일 때만
		 두 수의 곱이 한자리 수인지 두자리 수인지 출력한다
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요.");
		int 숫자1 = sc.nextInt();
		sc.nextLine();
		int 숫자2 = sc.nextInt();
		sc.nextLine();
		
		// 두 수가 모두 1부터 9까지 수인지 한번에 확인
		if ((숫자1>=1 && 숫자1<10) && (숫자2>=1 && 숫자2<10)) {
			// 두 수가 1부터 9일때 곱하기
			int 곱 = 숫자1 * 숫자2;
			if (곱>=1 && 곱<10) {
				System.out.println("곱의 결과가 한자리 입니다");
			} else {
				System.out.println("곱의 결과가 두자리 입니다");
			}
		} else {
			System.out.println("입력한 수 중에서 1~9가 아닌 수가 있습니다");
		}
	}
}
