package ncs.test4;

import java.util.*;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 : ");
		String productName = sc.nextLine();
		System.out.print("상품 가격 : ");
		int productPrice = sc.nextInt();
		System.out.print("상품 수량 : ");
		int productQuantity = sc.nextInt();
		
		Product 상품 = new Product(productName, productPrice, productQuantity);
		
		System.out.println(상품.information());
		System.out.println(상품.totalPrice());
		
	}

}
