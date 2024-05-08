package 자바_예제문제실습;
/*
 빨간선이 뜨는 부분을 해결하기
 */
public class 오버로딩 {
	
	
	public void test() {}
	public void test(String str, String a) {}
	
	public void test(int i, boolean b) {}
	public void test(String s) {}
	
	private void test(int a) {}
	
	private void test(char a, int z) {}
	
	public void test(char ch) {}
	
	public void test(boolean a) {}
	public void test(boolean b, String z) {}
	public void test(short s, String a) {}
	public void test(short c, long x) {}
	
	
	public void test(int a, String b) {}
	public void test(int a, String b, long c) {}

	public void test(String c, int b) {}
	public void test(String c, int b, double s) {}
	
	public void test(boolean a, boolean b) {}
	public void test(boolean a, boolean b, int c) {}
	
	public String test(String a, int b, boolean d) {
		return "테스트";
	}
	
	public int test(short i, short k) {
		return 1;
	}
	
}
