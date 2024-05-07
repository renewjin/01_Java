package com.kh.test.main.oop;
// Parent = 부모
// 부모클래스
public class Parent {
// 필드
	int 부모변수;
	
// 메서드
	// 생성자 기본 ctrl space enter
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	
	// 생성자 필수
	public Parent(int 부모변수) {
		this.부모변수 = 부모변수;
	}
		
	public void 부모메서드() {
		System.out.println("부모님이 등장했습니다.");
	}

}
