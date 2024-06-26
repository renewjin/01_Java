package pre.propertiesEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
import java.util.Properties;

public class ProTest {
	
	// fileSave
	public static void fileSave(Properties p) {
		// 1. 순풍산부인과 1998 682
		// 2. 똑바로살아라 2002 239
		// 3. 눈물의여왕  2024 16
		// 4. 아내의유혹  2008 129
		p.setProperty("1", "순풍산부인과,1998,682");
		p.setProperty("2", "똑바로살아라,2002,239");
		p.setProperty("3", "눈물의여왕,2024,16");
		p.setProperty("4", "아내의유혹,2008,129");
		
		// xml : 텍스트 기반의 문서 웹에서 읽기 편하도록 < > 규칙을 지정해서 작성하는 공간
		try {
			// drama.xml
			FileOutputStream fos = new FileOutputStream("drama.xml");
			
			p.storeToXML(fos, null);
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//public static void fileOpen(Properties p) {
	public static void fileOpen() {
		Properties p = new Properties();
		 try {
			FileInputStream fis = new FileInputStream("drama.xml");
			p.loadFromXML(fis); // fis에 해당하는 파일 로드
			fis.close();
			
			// Properties 객체에 키-값을 넣어서 List저장
			List<Drama> 드라마들 = new ArrayList<>(); // 눈으로 데이터가 어떻게 들어있는지 데이터를 담을 리스트를 만들어준 것
			// for 문으로 설정 파일안에 적혀있는 이름을 기준으로 모두 추가하기
			for(String key : p.stringPropertyNames()) { // xml 파일 안에 들어있는 모든 값을 문자열 형태로 변경해서 검색할 수 있도록 함
				// stringPropertyNames() : key값을 반환함
				// 모든키를 담을 String[]을 생성해서 key들을 모두 담아줌 단 , 기준으로 
				System.out.println("key : " + key);
				String[] values = p.getProperty(key).split(",");
				// 각각 변수에 담아서 생성
				// 설정값 안에 있는 내용들을 모두 String에 담아준 후 가져온 것이기 때문에
				// 정수는 모두 String -> int로 변경해서 사용해야함
				String name = values[0];
				int 출시년도 = Integer.parseInt(values[1]);
				int 몇부작 = Integer.parseInt(values[2]);
				
				Drama 드라마 = new Drama(name, 출시년도, 몇부작);
				// 각각 담은 드라마를 모두 추가하기
				// 비어있는 드라마들 리스트에 각각의 드라마 추가하기
				드라마들.add(드라마);
			}
			
			// 정렬을 할 때는 정렬하는 기준이 있음
			// Drama[] 위에 추가한 드라마는 모두 장바구니에 담음
			// 정렬할 때는 이름이면 이름 년도별 몇부작 정렬하는 기준
			// 담겨있는 드라마들을 다시 정렬하겠다.   정렬하는 기준 Drama[0] = name
			Drama[] 드라마정렬 = 드라마들.toArray(new Drama[0]);
			//Drama[] 드라마정렬 = 드라마들.toArray(new Drama[1]); // 출시년도 기준 정렬
			//Drama[] 드라마정렬 = 드라마들.toArray(new Drama[2]); // 몇부작 기준 정렬
			Arrays.sort(드라마정렬);
			
			System.out.println("드라마 목록 : ");
			for(Drama d : 드라마들) {
				System.out.println(d);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Properties p = new Properties();
		fileSave(p);
		fileOpen();
	}
}
