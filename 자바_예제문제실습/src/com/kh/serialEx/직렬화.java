package com.kh.serialEx;

import java.io.*;
import java.io.FileOutputStream;
// 직렬화
public class 직렬화 {
	public static void main(String[] args) {
		// 직렬화된 데이터를 저장할 파일 경로
		String 파일이름 = "student.txt";
		
		// 직렬화해서 전송할 객체 생성
		Student 학생 = new Student("박말숙", 30);
		
		// 객체를 파일로 직려로하하는 코드
		try {
			FileOutputStream fos = new FileOutputStream(파일이름);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 객체를 직렬화해서 파일 작성하기
			oos.writeObject(학생);
			oos.close();
			System.out.println("객체를 직렬화해서파일에 저장했습니다.");
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
