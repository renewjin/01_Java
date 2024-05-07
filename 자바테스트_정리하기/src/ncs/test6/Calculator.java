package ncs.test6;

import java.util.Scanner;

public class Calculator {
	
	// 기본생성자
	public Calculator() {
	}

	
	public double getSum(int num) {
		int sum = 0;
		for (int i = 1; i<=num; i++) {
			sum += i;
		}
		
		return sum;
	}


}
