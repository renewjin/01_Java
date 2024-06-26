package ncs.test7;

public class Student extends Human {
// 필드
	private String number;
	private String major;

// 메서드
	// setter
	public void setNumber(String number) {
		this.number = number;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	// getter
	public String getNumber() {
		return number;
	}

	public String getMajor() {
		return major;
	}
	
	// 기본생성자
	public Student() {
	}

	// 필수생성자
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + ", number=" + number + ", major=" + major;
	}
	
	
	
}
