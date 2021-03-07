package cooperation;

public class Taxi {

	int taxiNumber;
	int money;

	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
	}

	public void showTaxiInfo() {
		System.out.println("택시 번호는 " + taxiNumber + " 이고, 수입은 " + money + "입니다.");
	}
	
}
