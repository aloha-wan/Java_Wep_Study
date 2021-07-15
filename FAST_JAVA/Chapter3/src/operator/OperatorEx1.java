package operator;

public class OperatorEx1 {

	public static void main(String[] args) {

		int num1 = -10;
		int num2 = 20;

		// +연산자에서는 부호가 유지된다.
		System.out.println(+num1);
		System.out.println(+num2);
		
		// - 연산자에서는 부호가 바뀐다. 단, 변수 자체 메모리에 부호는 바뀌지 않는다.
		System.out.println(-num1);
		System.out.println(-num2);

	}

}
