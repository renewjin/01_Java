package ncs.test5;

public class BookArrayTest {
	public static void main(String[] args) {
		Book[] bArray = new Book[3];
		
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 정석", "구정은", 29000, "프피렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);
		
		for (Book b:bArray) {
			String title = b.getTitle();
			String author = b.getAuthor();
			String publisher = b.getPublisher();
			int price = b.getPrice();
			double discountRate =  b.getDiscountRate()*100;
			System.out.println(discountRate);
			int discountPrice = (int) (price - (price * b.getDiscountRate()));
			System.out.println(title + ", " + author + ", " + publisher + ", " + price + "원, "
			+ discountRate + "% 할인" + " 할인된 가격 : " + discountPrice); //b.get할인가 );
		}
	}
}
