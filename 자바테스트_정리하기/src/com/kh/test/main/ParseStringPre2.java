package com.kh.test.main;

public class ParseStringPre2 {
	public static void main(String[] args) {
		// String으로 받은 핸드폰번호를 정수로 변경
		String phoneNumber = "01012345678";
		int num1 = Integer.parseInt(phoneNumber);
		System.out.println(num1);
		
		// String으로 받은 점수를 실수로 변경
		String score = "88.9";
		double num2 = Double.parseDouble(score);
		System.out.println(num2);
		
		//정수로 받은 핸드폰 번호를 String으로 변환
		int phoneNumber2 = 102345678;
		String str1 = Integer.toString(phoneNumber2);
		System.out.println(str1);
		
		// 실수로 받은 점수를 String으로 변경
		double score2 = 72.5;
		String str2 = Double.toString(score2);
		System.out.println(str2);
		
	}
}
