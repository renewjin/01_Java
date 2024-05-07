package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
	public void fileSave(String filename) {
		File file = new File(filename);
		
		try {
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person 사람 = new Person();
			bw.write(사람.toString());
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		PersonMain 사람 = new PersonMain();
		
		사람.fileSave("person.txt");
	}
}
