package com.kh.oop.pre;
// 상속부모
public class Animal {
// 필드
	private String name;


// 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	// 생성자 필수
	public Animal(String name) {
		//super();
		this.name = name;
	}
	
	// void
	public void makeSound() {
		System.out.println(name + "가 소리를 냅니다.");
	}
	
}
