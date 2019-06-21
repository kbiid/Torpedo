package enumex;

/**
 * 열거형에 값을 추가한 형태
 * 
 * @author user
 *
 */
public enum DevTypeAddString {
	JAVA("자바"), TOOL("Eclipse"), IT("A.I");

	final private String name;

	private DevTypeAddString(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
