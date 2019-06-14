package copy.object;

public class DeepCopyObject {
	private Member member;
	private Major major;

	public DeepCopyObject() {
		member = null;
		major = null;
	}

	public Member getMember() {
		return member;
	}

	public void deepCopy(Member member) {
		major = new Major(member.getMajor().getMajorName(), member.getMajor().getMajorNum());
		this.member = new Member(member.getName(), member.getAge(), member.getHobby(), major);
	}

	public void showContents() {
		System.out.println("Deep Copy : " + member.getName() + " " + member.getAge() + " " + member.getHobby() + " "
				+ member.getMajor().getMajorName() + " " + member.getMajor().getMajorNum());
	}
}
