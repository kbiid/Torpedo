package copy.object;

public class Member {
	private String name;
	private int age;
	private String hobby;
	private Major major;

	public Member(String name, int age, String hobby, Major major) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		this.major = major;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getHobby() {
		return hobby;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Major getMajor() {
		return major;
	}

	public void showContents() {
		System.out.println("원본 : " + getName() + " " + getAge() + " " + getHobby() + " " + getMajor().getMajorName()
				+ " " + getMajor().getMajorNum());
	}
}
