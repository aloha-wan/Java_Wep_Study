package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10 ) < 10 ) && ( ( i = i + 2) < 10);

		System.out.println(num1);	// 20
		System.out.println(i);		// num1연산에서 틀렸기 때문에 i 연산을 하지 않는다.
		
		System.out.println(value);

		int num2 = 10;
		int num3 = 20;
		
		int max = (num2 > num3)? num2:num3;
		System.out.println(max);
	}

}
