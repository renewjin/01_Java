package pre.propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import pre.propertiesEx2.Drama;

public class PropTest {
	public static void fileSave(Properties p) {
		// Properties 에 XML 파일로 내용 저장하기
		
		p.setProperty("1", "패밀리맨,4,2000");
		p.setProperty("2", "엔리멘탈,5,2023");
		p.setProperty("3", "투모로우,5,2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			
			p.storeToXML(fos, "movies is fun."); // fos에 p데이터 저장  movies is fun. -> 파일코멘트

			fos.close();// 파일 저장후 종료
			
			System.out.println("설정이 movies.xml 파일에 저장되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(Properties p) {
		try {
			FileInputStream fis = new FileInputStream("movies.xml");
			p.loadFromXML(fis);
			fis.close();
			
			List<Movies> 영화들 = new ArrayList<>();
			for (String key : p.stringPropertyNames()) {
				String [] values = p.getProperty(key).split(",");
				
				// 각 값들의 형태를 맞춰 객체에 넣어줘야함
				String 제목 = values[0];
				int 평점 = Integer.parseInt(values[1]);
				int 출시년도 = Integer.parseInt(values[2]);
				
				Movies 영화 = new Movies(제목, 평점, 출시년도);
				영화들.add(영화);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Properties p = new Properties();
		fileSave(p);
	}
}
