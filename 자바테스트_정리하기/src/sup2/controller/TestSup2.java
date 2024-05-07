package sup2.controller;

import java.util.Scanner;

import sup2.model.Student;

public class TestSup2 {
	public static void main(String[] args) {
		// Scanner 를 이용해서 이름 학년 반 번호 성별 성적
		// Student 학생 = new Student(이름, 학년, 반, 번호, 성별, 성적)
		// 학생.정보();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String 이름 = sc.nextLine();
		
		System.out.print("학년 : ");
		int 학년 = sc.nextInt();
		System.out.print("반 : ");
		int 반 = sc.nextInt();
		System.out.print("번호 : ");
		int 번호 = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char 성별 = sc.next().charAt(0);
		
		System.out.print("성적 : ");
		double 성적 = sc.nextDouble();
		
		Student 학생 = new Student(이름, 학년, 반, 번호, 성별, 성적);
		학생.정보();
		
	}
	
	

}
