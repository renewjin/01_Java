package 자바_예제문제실습;

import java.io.Serializable;

/*
 캡슐화
 String 사람이름 김영희
 int 나이 10
 생성자 만들기
 toString 출력
 
 PersonMain person.txt저장
 */
//public class Person {
// 다른데서 데이터를 사용할 수 있으니 직렬화 표현해줘라
public class Person implements Serializable {
// 필드
	private String 사람이름;
	private int 나이;
	
// 메서드
	// 기본
	public Person() {
	}
	// 필수
	public Person(String 사람이름, int 나이) {
		super();
		this.사람이름 = 사람이름;
		this.나이 = 나이;
	}
	// getter, setter
	public String get사람이름() {
		return 사람이름;
	}
	public int get나이() {
		return 나이;
	}
	public void set사람이름(String 사람이름) {
		this.사람이름 = 사람이름;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
	@Override
	public String toString() {
		return "사람이름=" + 사람이름 + ", 나이=" + 나이 ;
	}
	
	
	
	
	
}
