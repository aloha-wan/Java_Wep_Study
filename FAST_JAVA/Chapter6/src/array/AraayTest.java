package array;

public class AraayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++, num++) {
			arr[i] = num;
			//System.out.println(arr[i]);
		}
		
		//for(int i = 0; i <= 9; i++) {
		// 위 처럼 했을 경우 결과값은 동일 하지만 가독성을 위해 i < 10이 좋다.
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
//			System.out.println(arr[i]);
		}
		System.out.println(total);

		double[] dArr = new double[5];
		int count = 0;
		
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		double dTotal = 1;
		for(int i = 0; i < count; i++) {
			dTotal *= dArr[i];
		}
		
		System.out.println(dTotal);
	}

}
