package com.kh.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePre {
	public static void main(String[] args) throws IOException {
		String 파일이름 = "practice.txt";
		File file = new File(파일이름);
		// 파일이 존재하는지 확인
		if(file.exists()) {// 존재한다면 이미 존재합니다. 라는 문구를 출력
			System.out.println("파일이 이미 존재합니다");
		} else {// 존재하지 않는다면 만들어줌
			file.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		}
		
		// 파일에 글을 작성하기
		FileWriter 글쓰기 = new FileWriter(file);
		
		// Java \n File \n 객체 \n 종료하기 실행
		글쓰기.write("Java\nFile\n객체\n");
		글쓰기.close();
	}
}
