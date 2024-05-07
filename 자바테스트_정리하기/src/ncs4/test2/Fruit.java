package ncs4.test2;

public class Fruit implements Comparable<Fruit> {
// 필드
	private String name;
	private int price;
	private int quantity;

// 메서드
	// getter, setter
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// 기본생성자
	public Fruit() {
	}

	// 필수생성자 과일명 과일가격 수량
	public Fruit(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price + ", quantity=" + quantity;
	}
	
	@Override
	public int compareTo(Fruit 과일비교) {
		return this.name.compareTo(과일비교.name);
	}
	
}
