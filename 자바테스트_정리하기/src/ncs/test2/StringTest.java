package ncs.test2;

public class StringTest {
	public static void main(String[] args) {
		// 주어진 String 데이터를 ","로 나누어 5개의 실수 데이터들을 꺼내어 합과 평균 구한기
		// 단 String 문자열의 모든 실수 데이터를 배열로 만들어 계산
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		
		// 문자열을 , 기준으로 나눠서 장바구니 배열로 만들어서 장바구니처럼 담아줌
		String [] numbers = str.split(",");
		System.out.println(numbers[0]);
		// , 나눈 실수들을 모아서 double에 담아줌
		double[] values = new double[numbers.length];
		// number에서 나온 최대 길이만큼 장바구니 배열 크기를 생성
		
		// 문자열로 담겨진 배열을 실수로 변환하는 형변환
		for(int i = 0;i<numbers.length; i++) {
			// 문자열(String)을 실수(Double)로 변환하는데 사용
			values[i] = Double.parseDouble(numbers[i]);
			System.out.println("values[" + i + "] : " + values[i]);
		}
		
		// 실수로 만들어진 값들의 합 구하기
		double 합 = 0;
		for(double num : values) {
			합 += num;
		}
		double 평균 = 합/values.length;
		
		//출력
		System.out.println("원래 주어진 값 : " + str);
		System.out.println("합계 : " + 합);
		System.out.println("평균 : " + 평균);
	}
}
