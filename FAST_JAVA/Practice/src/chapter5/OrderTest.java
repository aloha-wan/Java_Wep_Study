package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();

		order.odNb = "201907210001";
		order.odId = "abc123";
		order.odDate = "2019년 7월 21일";
		order.odNM = "홍길순";
		order.productId = "PD0345-12";
		order.odAdd = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+ order.odNb);
		System.out.println("주문자 아이디 : "+ order.odId);
		System.out.println("주문 날짜 : "+ order.odDate);
		System.out.println("주문자 이름 : "+ order.odNM);
		System.out.println("주문 상품 번호 : "+ order.productId);
		System.out.println("배송 주소 : "+ order.odAdd);

	}

}
