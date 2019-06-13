package serializable;

import java.io.Serializable;

/**
 * 직렬화할 클래스
 * 
 * @author user
 *
 */
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private int age;

	public Member(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String toString() {
		return String.format("Member{name='%s', email='%s', age='%s'}", name, email, age);
	}
}
