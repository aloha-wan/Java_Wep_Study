package inheritance;

public class VIPCustomer extends Customer{

	//extends Customer 를 추가하면 작성하지 않아도 된다.
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	double salesRatio;		// 할인율
	private int agentID;
	
	// extends Customer를 선언을 한다해도 private로 선언한 변수는 사용할수 없으므로
	// 사용하려면 protected로 선언 해야한다.
//	public VIPCustomer () {
//		
//		// 상위 클래스가 먼저 생성 되게 한다.
//		super();
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 생성자 호출");
//	}	
	
	public VIPCustomer (int customerID, String customerName) {
		
		// 상위 클래스가 먼저 생성 되게 한다.
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
//		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}

	// 컴파일러에 정보를 주고 오류를 방지한다.
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio); 
	}
}
