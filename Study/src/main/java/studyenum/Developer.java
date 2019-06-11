package studyenum;

public class Developer {
	private String name;
	private int career;
	private DevType devType;

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

	public void setDevType(DevType devType) {
		this.devType = devType;
	}

	public DevType getDevType() {
		return devType;
	}
}
