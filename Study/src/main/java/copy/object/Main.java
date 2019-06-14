package copy.object;

public class Main {
	public static void main(String[] args) {
		Major major = new Major("컴공", 56);
		Member member = new Member("김기주", 26, "게임", major);

		ShallowCopyObject shallow = new ShallowCopyObject();
		shallow.shallowCopy(member);

		DeepCopyObject deep = new DeepCopyObject();
		deep.deepCopy(member);

		System.out.println("값 변경 전");
		member.showContents();
		shallow.showContents();
		deep.showContents();

		System.out.println("\n원본 값 변경 진행");
		member.setName("홍길동");
		member.setAge(23);
		member.setHobby("음악감상");
		member.getMajor().setMajorName("경영");
		System.out.println("");

		System.out.println("값 변경 후");
		member.showContents();
		shallow.showContents();
		deep.showContents();
	}
}
