package variable;

public class DoubleTest2 {

	public static void main(String[] args) {

		double dNum = 1;
		
		for(int i = 0; i < 10000; i++) {
			dNum = dNum + 0.1;
		}

		//1001이 아닌 부동 소수점방식의 오류로 작은 숫자의 차이가 난다.

		System.out.println(dNum);
	}

}
