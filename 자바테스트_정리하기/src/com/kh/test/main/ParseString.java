package com.kh.test.main;

public class ParseString {
	public static void main(String[] args) {
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println("문자열을 정수로 변환한 결과 : " + num1);
		
		String str2 = "123.45";
		double num2 = Double.parseDouble(str2);
		System.out.println("문자열을 실수로 변환한 결과 : " + num2);
		
		// 정수를 문자열로 변환
		int num3 = 123;
		String str3 = Integer.toString(num3);
		System.out.println("정수를 문자열로 변환한 결과 : " + str3);
		
		double num4 = 123.45;
		String str4 = Double.toString(num4);
		System.out.println("실수를 문자열로 변환한 결과 : " + str4);
		
		// 문자열에서 - 하이픈 제거
		String phoneNumber3 = "010-1234-5678";
		// replace 어떤 값을 모두 변경
		// ""안에 아무것도 작성해주지 않으면 삭제라는 의미로 사용
		String 하이픈제거 = phoneNumber3.replace("-","");
		System.out.println("하이플이 제거된 핸드폰 번호 : " + 하이픈제거);
		
		// 주민번호에서 하이플 제거
		String id = "230304-1234567";
		// 하이픈 제거하고 숫자만 모두 보기
		String 주민번호 = id.replace("-", "");
		System.out.println(주민번호);
		
		// charAt(7)
		// 주민등록 번호에서 하이픈을 제거하고 성별을 추출하기
		String id2 = "230101-3456789";
		String 주민번호2 = id2.replace("-", "");
		char 성별번호 = 주민번호2.charAt(6);
		System.out.println("성별번호 : " + 성별번호);
		
		// 3항 연산자를 사용해서 성별번호가 1또는 3이면 ? "남성" : "여성";
		
		String 성별 = (성별번호 == '1' || 성별번호 == '3') ? "남성" : "여성";
		System.out.println(성별);
		
		// 주민번호에서 - 제거하고 삼항연산자를 사용해서 성별 추출
		String id3 = "200101-4567891";
		String 주민번호3 = id3.replace("-", "");
		char 성별번호3 = 주민번호3.charAt(6);
		String 성별3 = (성별번호3 == '1' || 성별번호3 == '3') ? "남성" : "여성";
		System.out.println(성별3);
		
		String 주민번호4 = "870101-2345678";
		// 주민번호가 앞에는 6자리가 맞는지 확인하고 뒤에는 7자리가 맞는지 확인
		boolean is주민 = (주민번호4.length() == 14) && // 1. 주민등록번호가 - 포함해서 14자리가 맞는지 확인
				(주민번호4.charAt(6) == '-') && // 2. 주민등록번호 생년월이작성후 - 들어가 있는지
				(주민번호4.substring(0,6).matches("[0-9]+")) && // 3. 앞에 6자리가 숫자로만 이루어져있는지
				(주민번호4.substring(7).matches("[0-9]+")); // 4. 뒤에서7번부터 모두 숫자로 이루어져있는지
		
		System.out.println("주민번호가 제대로 작성이 이루어졌나요? : " + is주민);
	}
}
