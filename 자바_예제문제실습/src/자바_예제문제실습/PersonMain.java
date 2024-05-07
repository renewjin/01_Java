package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
	public void fileSave(String filename) {
		// File FileWriter BufferedWriter 사용해서 파일 작성하고 저장
		File file = new File(filename); // File 객체 생성
		
		try {
			FileWriter fw = new FileWriter(file); // FileWriter 객체 생성
			
			BufferedWriter bw = new BufferedWriter(fw); // BufferedWriter 객체 생성
			
			Person 사람 = new Person("김영희", 10);
			bw.write(사람.toString());
			bw.close();
			
			System.out.println("파일이 저장되었습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		PersonMain 사람메인파일만들기 = new PersonMain();
		
		사람메인파일만들기.fileSave("person.txt");
	}
}
