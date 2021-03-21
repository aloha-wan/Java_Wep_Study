package Serializble;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Serialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Member member = new Member();
		member.setName("kim");
		member.setAge(20);
		
		// Serialize
		byte[] serializedMember;
	    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
	            oos.writeObject(member);
	            // serializedMember -> 직렬화된 member 객체
	            serializedMember = baos.toByteArray();
	        }
	    }
	    
	    // 바이트 배열로 생성된 직렬화 데이터를 base64로 변환
		String base64Member = Base64.getEncoder().encodeToString(serializedMember);
		System.out.println(base64Member);
	    
		// Deserialize
	    byte[] deserializedMemebr = Base64.getDecoder().decode(base64Member);
	    try (ByteArrayInputStream bais = new ByteArrayInputStream(deserializedMemebr)) {
	        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
	            // 역직렬화된 Member 객체를 읽어온다.
	            Object objectMember = ois.readObject();
	            System.out.println(objectMember);
	        }
	    }
	}

}
