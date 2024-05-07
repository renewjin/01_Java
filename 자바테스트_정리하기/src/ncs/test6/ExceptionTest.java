package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5이하의 정수를 입력해 주세요 : ");
		
		int num = sc.nextInt();
		if (num<2 || num>5) {
			InvalidException 메시지 = new InvalidException();	
			System.out.println(메시지.InvalidException());
			return;
		}
		
		Calculator 계산기 = new Calculator();
		System.out.println(계산기.getSum(num));
		
	}
}
