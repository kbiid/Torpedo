package copy.object;

public class Major {
	private String majorName;
	private int majorNum;

	public Major(String majorName, int majorNum) {
		this.majorName = majorName;
		this.majorNum = majorNum;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorNum(int majorNum) {
		this.majorNum = majorNum;
	}

	public int getMajorNum() {
		return majorNum;
	}
}
