package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		
//		date.day = 10;
//		date.month = 7;
//		date.year = 2019;
		
		date.setDay(10);
		date.setMonth(77);
		date.setYear(2019);
		
		date.showDate();
	}

}
