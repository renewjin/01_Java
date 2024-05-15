package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		// year 1987, month 5, day 27 
		// GregorianCalendar 클래스 사용
		// 출력시 SimpleDateFormat 사용
		// 생일 1987년 5월 27일 수요일
		// 현재
		// 나이
		int year = 1987;
		int month = 5;
		int day = 27;
		
		//현재날짜 가져오기
		Calendar 현재날짜 = Calendar.getInstance();
		int 현재년도 = 현재날짜.get(Calendar.YEAR);
		int 현재월 = 현재날짜.get(Calendar.DAY_OF_MONTH);
		int 현재일 = 현재날짜.get(Calendar.DATE);
		
		// 나이
		int 나이 = 현재년도 - year;
		
		if (현재월<month || ((현재월==month) && (현재일<day))) {
			나이--;
		}
		
		// 생일
		Calendar 생일 = new GregorianCalendar(year, month-1, day);
		
		// 날짜 표기방법
		SimpleDateFormat 출력날짜 = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE");
		System.out.println(출력날짜.format(생일.getTime()));
		System.out.println(나이);
		
	}
}
