package ncs.test11;

import java.util.Comparator;

//내림차순으로 정렬하는 Comparator<Integer>을 사용
public class Decending implements Comparator<Integer>{
	// 미완성된 메서드 작성해야하기때문에 빨간줄 표시가 나는 것
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	/*
	 o1이 o2보다 작으면 거꾸로
	 o1이 o2랑 같으면 0
	 o1이 o2보다 크면 올바르게
	 */
}
