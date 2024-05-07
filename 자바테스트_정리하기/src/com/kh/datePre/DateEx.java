package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// Date로  현재 날짜를 받아서 년-월-일 출력하기
		// Date는 최초1회만 호출
		Date now = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
		
		String 날짜 = sdf1.format(now);
		System.out.println(날짜);
		
		// 문자열(SimpleDateFormat) -> 날짜(Date) 변경
		try {
			Date parseDate1 = sdf1.parse(날짜); // 시분초가 없어 해당되는 값은 0으로 나타남
			System.out.println(parseDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH시 mm분 ss초");
		String 시간 = sdf2.format(now);
		System.out.println(시간);
		
		// 문자열(SimpleDateFormat) -> 날짜(Date) 변경
		try {
			Date parseDate2 = sdf2.parse(시간);
			System.out.println(parseDate2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String 날짜시간 = sdf3.format(now);
		System.out.println(날짜시간);
		
		// 문자열(SimpleDateFormat) -> 날짜(Date) 변경
		try {
			Date parseDate3 = sdf3.parse(날짜시간);
			System.out.println(parseDate3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
