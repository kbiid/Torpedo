package BaseBallGame_TDD;

//테스트 코드에 기반하면 만들어진 게임 클래스
public class Game {

	private int [] randomNumberArray = new int[3];
	private int [] userNumberArray = new int[3];
	
	public Game() {
		makeRandomNumber();
	}
	
	public Game(int x,int y,int z) {
		userNumberArray[0] = x;
		userNumberArray[1] = y;
		userNumberArray[2] = z;
	}
	
	protected void makeRandomNumber() {
		for(int i=0; i<randomNumberArray.length; i++) {
			randomNumberArray[i] = (int)(Math.random()*9) + 1;
		}
		
		checkOverlap(randomNumberArray);
	}
	
	public int[] getArray() {
		return randomNumberArray;
	}
	
	//숫자 중복 검사 위한 메소드
	private void checkOverlap(int [] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(i != j) {
					while(array[i] == array[j]) {
						array[i] = (int)(Math.random()*9) + 1;
					}
				}
			}
		}
	}
	
	public int[] getUserArray() {
		return userNumberArray;
	}
}
