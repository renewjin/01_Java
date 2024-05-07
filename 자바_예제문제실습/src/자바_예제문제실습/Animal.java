package 자바_예제문제실습;

import java.io.Serializable;

/*
 캡슐화 원칙에 맞게 구현하기
// 필드
 String 동물이름;
 int 나이;
 
// 메서드
 getter
 setter
 기본 생성자
 필수 생성자
 @Overrid toString 활용해서 문자열 출력하기
 */
//public class Animal {
// 다른데서 데이터를 사용할 수 있으니 직렬화 표현해줘라
public class Animal implements Serializable {
// 필드
	private String 동물이름;
	private int 나이;

// 메서드
	// 기본생성자
	public Animal() {
	}

	// 필수생성자
	public Animal(String 동물이름, int 나이) {
		this.동물이름 = 동물이름;
		this.나이 = 나이;
	}
	
	// getter, setter
	public void set동물이름(String 동물이름) {
		this.동물이름 = 동물이름;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
	public String get동물이름() {
		return 동물이름;
	}

	public int get나이() {
		return 나이;
	}

	@Override
	public String toString() {
		return "동물이름=" + 동물이름 + ", 나이=" + 나이;
	}
	
	
		

}
