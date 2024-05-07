package com.kh.test.main;

import java.util.*;

public class MapPre {
	public static void main(String[] args) {
		// Map 또한 마찬가지로 인터레이스 이기 때문에
		// 인스턴스 느낌으로 사용하려면
		// Map<String, Integer> map = new HashMap<>(); 과 같이 사용해야함
		
		Map<String, Integer> map = new HashMap<>();
		// 순서가 보장되지 않음
		map.put("apple", 2000);
		map.put("banana", 3000);
		map.put("cherry", 1000);
		System.out.println(map);
		
		// 주의 !!
		map.put("banana", 500); // banana 키 중복 -> 값 변경
		System.out.println(map);
		
		map.put("banana ", 1000); // 공백 글자로 봄 -> 중복아님
		System.out.println(map);
		
		map.put(" banana ", 1000); // 공백 글자로 봄 -> 중복아님
		System.out.println(map);
		
	}
}
