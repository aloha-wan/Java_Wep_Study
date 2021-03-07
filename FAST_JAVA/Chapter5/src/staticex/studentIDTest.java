package staticex;

public class studentIDTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("LEE");
		System.out.println(Student.serialNum);
		
		// Student studentLee = new Student("LEE"); 이 문장을 선언 하지 않더라도 사용 가능하게 하려면
		//  public static int getSerialNum() 을 Student.java 에 구현해주면 된다.		
		// System.out.println(Student.getSerialNum());
		
		Student studentKim = new Student("Kim");
		
		System.out.println(Student.serialNum);
		System.out.println(Student.serialNum);

		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
	}

}
