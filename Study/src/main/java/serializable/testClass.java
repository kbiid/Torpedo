package serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class testClass {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Member member = new Member("김배민", "deliverykim@baemin.com", 25);
		byte[] serializedMember;

		// 직렬화 과정
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
				oos.writeObject(member);
				// serializedMember -> 직렬화된 member 객체
				serializedMember = baos.toByteArray();
			}
		}
		// 직렬화된 데이터 출력
		String data = Base64.getEncoder().encodeToString(serializedMember);
		System.out.println(data);

		// 역직렬화
		String basse64Member = data;
		byte[] deserializedMember = Base64.getDecoder().decode(basse64Member);
		try (ByteArrayInputStream bais = new ByteArrayInputStream(deserializedMember)) {
			try (ObjectInputStream ois = new ObjectInputStream(bais)) {
				// 역직렬화된 Member 객체를 읽어온다.
				Object objectMember = ois.readObject();
				Member member2 = (Member) objectMember;
				System.out.println(member2);
			}
		}
	}
}
