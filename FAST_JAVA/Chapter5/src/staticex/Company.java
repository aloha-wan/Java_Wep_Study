package staticex;

public class Company {

	private static Company instance = new Company();
	
	private Company() {
		
	}

	// 단 하나만 존재하는 인스턴스 - singleton  pattern	
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
