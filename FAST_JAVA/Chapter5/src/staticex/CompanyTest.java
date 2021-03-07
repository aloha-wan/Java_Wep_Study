package staticex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		// Company.java 에 company를 내부 변수선언을 했기 때문에 사용할 수 없다.
		// static 이어야 사용 가능.
		//Company company = new Company();
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();
		
	}

}
