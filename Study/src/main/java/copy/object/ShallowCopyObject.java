package copy.object;

public class ShallowCopyObject {
	private Member member;

	public ShallowCopyObject() {
		member = null;
	}

	public void shallowCopy(Member member) {
		this.member = member;
	}

	public Member getMember() {
		return member;
	}

	public void showContents() {
		System.out.println("Shallow Copy : " + member.getName() + " " + member.getAge() + " " + member.getHobby() + " "
				+ member.getMajor().getMajorName() + " " + member.getMajor().getMajorNum());
	}
}
