package studyenum;

public class enumTest {
	public static void main(String[] args) {
		testDeveloper();
		testDeveloperHaneEnum();
		testDeveloperExceptEnum();
		enumValues();
		enumOrdinal();
		enumValueOf();
		enumAddValue();
	}

	public static void testDeveloper() {
		Developer developer = new Developer();

		developer.setName("홍길동");
		developer.setCareer(5);
		developer.setDevType(DevType.MOBILE);

		System.out.println("이름 : " + developer.getName());
		System.out.println("경력 : " + developer.getCareer());
		System.out.println("직무 : " + developer.getDevType());
	}

	public static void testDeveloperHaneEnum() {
		DeveloperHaveEnum developer = new DeveloperHaveEnum();

		developer.setName("장발장");
		developer.setCareer(10);
		developer.setDevType(DeveloperHaveEnum.DevTypeDeveloper.SERVER);

		System.out.println("이름 : " + developer.getName());
		System.out.println("경력 : " + developer.getCareer());
		System.out.println("직무 : " + developer.getDevType());
	}

	public static void testDeveloperExceptEnum() {
		DeveloperExceptEnum developer = new DeveloperExceptEnum();

		developer.setName("홍길동");
		developer.setCareer(5);
		developer.setDevType(DevTypes.WEB);

		System.out.println("이름 : " + developer.getName());
		System.out.println("경력 : " + developer.getCareer());
		System.out.println("직무 : " + developer.getDevType());
	}

	public static void enumValues() {
		for (DevType type : DevType.values()) {
			System.out.println(type);
		}
	}

	public static void enumOrdinal() {
		for (DevType type : DevType.values()) {
			System.out.println(type.ordinal());
		}
	}

	public static void enumValueOf() {
		System.out.println(DevType.valueOf("WEB"));
	}

	public static void enumAddValue() {
		for (DevTypeAddString type : DevTypeAddString.values()) {
			System.out.println(type.getName());
		}
	}

}
