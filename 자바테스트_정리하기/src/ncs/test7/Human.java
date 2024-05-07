package ncs.test7;

public class Human {
// 필드
	private String name;
	private int age;
	private int height;
	private int weight;
	
// 메서드
	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}
	
	// 생성자 기본
	public Human() {
	}

	// 생성자 필수
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + 
				", height=" + height + ", weight=" + weight;
	}
	
}
