package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
// 필드
	private String productName; // 제품명
	private Date putDate; // 입고일
	private Date getDate; // 출고일
	private int putAmount; // 입고량
	private int getAmount; // 출고량
	private int inventoryAmount; // 남은갯수
	
// 메서드
	// 기본생성자 ctrl space
	public Inventory() {
		// TODO Auto-generated constructor stub
	}
	// 필수생성자 alt shift s o
	// 핸드폰 이름 출시일 재고량		판매와 판매후 남은 재고는 알 수 없기 때문에 지워줘야함
	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		//this.getDate = getDate;
		this.putAmount = putAmount;
		//this.getAmount = getAmount;
		//this.inventoryAmount = inventoryAmount;
	}
	
	// getter, setter
	public String getProductName() {
		return productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	// toString @Override
	@Override
	public String toString() {
		
		// 날짜 형식을 변경
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		String 문자열반환 = dateFormat.format(putDate);
		
		String 출고일변환 = dateFormat.format(getDate);
		//			현재재고		판매량
		int 남은재고 = putAmount - getAmount;
		
		
		return "제품명 =" + productName 
				+ ", 입고일 =" + 문자열반환 
				+ ", 출고일 =" + 출고일변환
				+ ", 입고량 =" + putAmount 
				+ ", 출고량 =" + getAmount 
				+ ", 재고량 =" + 남은재고;
	}
	
}
