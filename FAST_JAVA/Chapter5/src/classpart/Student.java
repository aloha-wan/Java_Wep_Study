package classpart;

/**
 * 클래스 정의하기
 *  학생이 있습니다.
 *  학생은 학번 이름 주소값을 가집니다.
 *  학생의 정보를 보여줍니다.
 *  학생에 대한 클래스를 구현해 보세요
 *
 */
public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		// address는 초기화 하기 않았을 때 null 값이 된다.
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
}
