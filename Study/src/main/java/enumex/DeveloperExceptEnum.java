package enumex;

public class DeveloperExceptEnum {
	private String name;
	private int career;
	public DevTypes devType;

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

	public void setDevType(DevTypes devType) {
		this.devType = devType;
	}

	public DevTypes getDevType() {
		return devType;
	}
}

enum DevTypes {
	MOBILE, WEB, SERVER
}
