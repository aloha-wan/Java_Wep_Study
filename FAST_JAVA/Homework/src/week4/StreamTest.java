package week4;

import java.util.Arrays;
import java.util.List;

/**
 * 컬렉션(혹은 컬렉션 유틸) 사용, 오름 차순 정렬, 중복제거, 최종출력 : 1,2,3,...,9,10
 *
 */
public class StreamTest {

	public static List<Integer> variable = Arrays.asList(null);
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 7, 8, 9, 2, 3, 6, 7, 10);
		
		for(Integer num : numbers) {
			deduplication(num);
		}
		
		// numbers 오름차순 정렬
//		variable.stream().sorted().forEach(s->System.out.print(s+","));
		variable = (List<Integer>) numbers.stream().sorted();
		
		System.out.println(variable);
	}

	private static void deduplication(Integer num) {

		if (!variable.contains(num)) {

			variable.add(num);

		}
		
	}

}
