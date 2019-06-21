package enumex;

public class DeveloperHaveEnum {
	private String name;
	private int career;
	private DevTypeDeveloper type;

	public enum DevTypeDeveloper {
		MOBILE, WEB, SERVER
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public int getCareer() {
		return career;
	}

	public void setDevType(DevTypeDeveloper devType) {
		this.type = devType;
	}

	public DevTypeDeveloper getDevType() {
		return type;
	}
}
