package com.kh.Sandwich;

import java.util.*;

public class 샌드위치가게 {

	public static void main(String[] args) {
		// 주문리스트 ArrayList
		ArrayList<샌드위치> 주문리스트 = new ArrayList<>();
		
		// "김하나", "BLT"
		// "이둘", "터키"
		// "김하나", "치킨"
		// "이둘", "에그마요"
		// "김하나", "베지터블"		
		주문리스트.add(new 샌드위치("김하나", "BLT"));
		주문리스트.add(new 샌드위치("이둘", "터키"));
		주문리스트.add(new 샌드위치("김하나", "치킨"));
		주문리스트.add(new 샌드위치("이둘", "에그마요"));
		주문리스트.add(new 샌드위치("김하나", "베지터블"));
		
		System.out.println(주문리스트);
		for (샌드위치 주문 : 주문리스트) {
			System.out.println(주문);
		}
		
		// 고객명 HashSet 
		HashSet<String> 고객명 = new HashSet<>(); // 샌드위치 클래스에 있는 고객명만 넣을것이므로 타입은 String
		
		// 중복제거리스트 ArrayList
		ArrayList<샌드위치> 중복제거리스트 = new ArrayList<>(); // 샌드위치의 클래스를 넣어줄 것으므로 타입은 해당하는 클래스명을 넣어야함
		
		// 중복여부를 확인하고 중복되지 않은 주문만 리스트에 추가
		for (샌드위치 주문 : 주문리스트) {
			if(!고객명.contains(주문.get고객명())) {
				중복제거리스트.add(주문);
				고객명.add(주문.get고객명());
			}
		}
		
		// 중복제거리스트 출력
		System.out.println(고객명);
		System.out.println(중복제거리스트);

	}

}
