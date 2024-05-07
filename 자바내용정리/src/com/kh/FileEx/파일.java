package com.kh.FileEx;
/*
 File(파일)
  폴더나 어떠한 이미지, 텍스트, 동영상 등 만들고 읽고 쓰는 것에 사용
  
  메서드
  	exists() : 파일이나 폴더가 존재하는지 확인 여부
  	mkdir() : 폴더 만들기
  	mkdirs() : 폴더 한번에 여러개 만들기
  	
  	
 FileWriter (파일만드는객체)
 	파일에 문자 데이터를 쓰기 위해 사용
 	파일에 텍스트를 작성하고 저장할 때 사용
 	
 	메서드 write() : 파일 내용작성
 		  flush() : 나머지 출력 스트림 버퍼를 비워내 모든 데이터를 파일에 사용
 		  close() : 출력 스트림을 닫고 저장
 		  
 	FileWriter 글쓰기 = new FileWriter(파일명); // 파일을 덮어쓴다음 새로 만들기
 	FileWriter 글쓰기 = new FileWriter(파일명, true); // 파일에 이어쓰기
 	
 StringBuilder : 파일에 작성할 내용을 변수에 담아 한번에 처리
 	StringBuilder 빌더 = new StringBuilder();
	빌더.append("첫번째 줄이어라. \n");
	빌더.append("두번째 줄이어라. \n");
	빌더.append("세번째 줄이어라. \n");
	
	-> 빌더라는 변수에 작성할 내용들이 들어가 있음
	-> BufferedWriter를 사용하면 더 빠르게 처리할 수 있음
	
BufferedWriter
	BufferedWriter 버퍼글쓰기 = new BufferedWriter(new FileWriter(파일명));
	버퍼글쓰기.write(빌더.toString());
	버퍼글쓰기.close();
	
 */
public class 파일 {

}
