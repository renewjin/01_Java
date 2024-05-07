package com.kh.goodShop;

import java.util.*;

public class 컴퓨터가게 {
	public static void main(String[] args) {
		// 모든 제품 HashMap
		Map<String, Integer> 제품 = new HashMap<>();
		// 상품추가 put
		// 노트북 700000
		// 데스크탑 20000
		// 모니터 5000
		// 마우스 3000
		// 키보드 2000
		
		제품.put("노트북", 700000);
		제품.put("데스크탑", 20000);
		제품.put("모니터", 5000);
		제품.put("마우스", 3000);
		제품.put("키보드", 2000);
		System.out.println(제품);
		
		System.out.println("컴퓨터 상품 목록");
		// Entry 사용해서 출력
		for (Map.Entry<String, Integer> e : 제품.entrySet()) {
			String 제품명 = e.getKey();
			int 가격 = e.getValue();
			System.out.println(제품명 + " : " + 가격 + "원");
		}
		
		// 특정 물품의 가격 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("찾으실 물품을 입력하세요 : ");
		//String 찾는물건 = "USB";
		String 찾는물건 = sc.nextLine();
		
		System.out.println(찾는물건 + " 가게에 있습니까? ");
		
		if(제품.containsKey(찾는물건)) {
			int 찾는물건가격 = 제품.get(찾는물건);
			System.out.println("네 있습니다. 가격은 " + 찾는물건가격 + "원 입니다");
		} else {
			System.out.println("죄송합니다 지금 품절입니다");
		}
		// containsKey 존재하는지 존재하지 않는지 if문 사용해서 확인 후
		// 존재한다면 네 존재
		// 존재하지 않는다면 품절
	}
}
