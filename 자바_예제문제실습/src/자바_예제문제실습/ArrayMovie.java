package 자바_예제문제실습;

import java.util.ArrayList;

public class ArrayMovie {
	public static void main(String[] args) {
		// 영화를 넣을 ArryList 생성
		ArrayList<Movie> 영화리스트 = new ArrayList<>();
		
		// 여기서 빨간줄 수정
		/*
		영화리스트.add(new Movie("어벤저스", "액션"));
		영화리스트.add(new Movie("매드맥스", "스릴러"));
		영화리스트.add("톰과제리");
		*/
		영화리스트.add(new Movie("어벤저스", "액션"));
		영화리스트.add(new Movie("매드맥스", "스릴러"));
		영화리스트.add(new Movie("톰과제리", "애니메이션"));
		
		
	}
}
