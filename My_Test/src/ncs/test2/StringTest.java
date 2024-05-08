package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data [] = new double[5];
		double sum = 0;
		
		String [] st = str.split(",");
		System.out.println(st[0]);
		
		for (int i = 0; i<st.length; i++) {
			data[i] = Double.parseDouble(st[i]); // 문자를 숫자로 변경 -> Double.parseDouble(문자)
			System.out.println(data[i]);
		}
		
		for(double num : data) {
			sum += num;
		}
		System.out.println(sum);
		double avg = sum / data.length;
		System.out.println(avg);
		
		
		
	}

}
