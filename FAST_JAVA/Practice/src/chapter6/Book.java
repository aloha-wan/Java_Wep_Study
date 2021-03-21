package chapter6;

import java.io.*;
import java.net.URLEncoder;

public class Book {

	public static void main(String[] args) {
		try {
			String url = URLEncoder.encode("https://www.fastcampus.co.kr/", "UTF-8");
			System.out.println(url);
			
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
