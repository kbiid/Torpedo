package BaseBallGame_TDD;

public class Game {

	private int [] randomNumberArray = new int[3];
	private int [] userNumberArray = new int[3];
	
	public Game() {
		MakeRandomNumber();
	}
	
	public Game(int x,int y,int z) {
		userNumberArray[0] = x;
		userNumberArray[1] = y;
		userNumberArray[2] = z;
	}
	
	protected void MakeRandomNumber() {
		for(int i=0; i<randomNumberArray.length; i++) {
			randomNumberArray[i] = (int)(Math.random()*9) + 1;
		}
		
		CheckOverlap(randomNumberArray);
	}
	
	public int[] GetArray() {
		return randomNumberArray;
	}
	
	private void CheckOverlap(int [] array) {
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
	
	public int[] GetUserArray() {
		return userNumberArray;
	}
}
