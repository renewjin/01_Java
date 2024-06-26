package com.kh.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
	// ctrl shift f 줄 정렬
	public static void main(String[] args) throws IOException {
		
		// 파일만들고 글 작성하기
		// 파일에 어떠한 경로 설정 없이 만들 때는 
		// 무조건 java 코드를 작성하고 있는 폴더 바로 아래에 만들어짐
		// 현재는 자바테스트_정리하기 라는 폴더 밑에 만들어질 예정
		String 파일이름 = "example.txt";
		
		File file = new File(파일이름);
		// 파일이 존재하는지 확인
		if(file.exists()) {
			System.out.println("파일이 존재합니다");
		} else {
			file.createNewFile();
			System.out.println("파일을 생성했습니다.");
		}
		
		// 글 작성하기
		FileWriter 글쓰기 = new FileWriter(file);
		
		글쓰기.write("이것은 파일작성 예시입니다.\n");
		글쓰기.write("글쓰는 방법을 진행하고 있습니다.\n");
		
		// 글을 다 작성했다면 close로 닫아줘야함
		// 우리가 어떤 파일을 작성하면서 저장하지 않고 종료할 때
		// 저장하시겠습니까? 라는 문구가 뜸녀서 저장 취소가 나오는 것처럼
		// close를 사용한다는 것은 저장하기와 같은 의미
		// close를 작성하지 않는다는 것은 글을 작성하다 취소하는 것과 같은 의미
		글쓰기.close();
	}
}
