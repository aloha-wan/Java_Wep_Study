package variable;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int i = 1000;
		byte bNum = (byte)i;	// 명시적 형변환
		
		System.out.println(bNum);
		
		double dNum1 = 1.2;
		float fNum = 0.9F;

		// 데이터 유실이 있을수 있다.
		int iNum1 = (int)dNum1 + (int)fNum;	// 1.2 -> 1 + 0.9 -> 0 = 0
		int iNum2 = (int)(dNum1 + fNum);	// 1.2 + 0.9 = 2.1 -> 2
		
		System.out.println(iNum1);
		System.out.println(iNum2);

	}

}
