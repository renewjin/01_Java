package 자바_예제문제실습;

import java.io.FileWriter;
import java.io.IOException;

/*
 기존에 있던 anumal.txt파일에 코뿔소 ~ 코끼리친구코뿔소를 이어서 작성하려하는데
 작성이 안됨
 이름=멧되지, 나이3
 코뿔소, 10 코끼리친구 코뿔소가 이어서 저장되게 만들어주기
 */

public class FileMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("animal.txt", true); // 기존파일에 이어쓰기 위해서 FileWriter("파일명", true)해주면 됨
			fw.write("\n코뿔소, 10");
			fw.write("코끼리친구코뿔소");
			fw.close();
			System.out.println("파일이 성공적으로 저장되었습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
