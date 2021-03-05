package classpart;

public class FunctionTest {

	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	// 어떤 인사말이 들어오면 출력
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 1~100 을 더하는 함수 매개변수가 필요 없이 public static int 로 return을 한다.
	public static int CalcSum() {
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		// int num = sayHello("안녕하세요");	<- void로 반환하는 것이 없기 때문에 에러난다. 
		sayHello("안녕하세요");
		int num = CalcSum();

		System.out.println(total);
		System.out.println(num);
	}

}
