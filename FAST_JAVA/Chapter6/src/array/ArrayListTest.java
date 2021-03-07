package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// crtl + shift + O 자동 import 가능
		// <어떤 객체를 사용할건지>
		ArrayList<String> list = new ArrayList<String>();

		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		for(String s : list) {
			System.out.println(s);
		}
		
	}

}
