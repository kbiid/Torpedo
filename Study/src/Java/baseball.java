package Java;

public class baseball {

	public static int solution(int [][] baseball) {
		
		int answer = 0;
		int[] array = new int[3];
		int[] array2 = new int[3];
		int strike,ball;
		
		for(int i=123; i<=987; i++) {
			
			array = setArray(array, i);
			
			if(array[0] == 0 || array[1] == 0 || array[2] == 0) continue;
			if(array[0] == array[1] || array[1] == array[2] || array[2] == array[0]) continue;
			
			for(int j=0; j<baseball.length; j++) {
				
				strike = 0;
				ball = 0;
				
				array2 = setArray(array2, baseball[j][0]);
				
				if(array2[0] == array[0] && array2[0] != 0) strike++;
				if(array2[1] == array[1] && array2[1] != 0) strike++;
				if(array2[2] == array[2] && array2[2] != 0) strike++;
				if(strike != baseball[j][1]) break;
				
				if(array2[0] == array[1] || array2[0] == array[2] && array2[0] != 0) ball++;
				if(array2[1] == array[0] || array2[1] == array[2] && array2[1] != 0) ball++;
				if(array2[2] == array[0] || array2[2] == array[1] && array2[2] != 0) ball++;
				if(ball != baseball[j][2]) break;
				
				if(j == baseball.length-1) answer++;
				
			}
		}
		
		return answer;
		
	}
	
	public static int[] setArray(int[] array, int value) {
		
		int num = 1;
		int tmp;
		
		for(int i=0; i<array.length-1; i++)
			num *= 10;
		
		tmp = value;
		
		for(int i=0; i<array.length; i++) {
			if(num >= 10) {
				array[i] = tmp/num;
				tmp = value % num;
				num /= 10;
			}
			else if(num == 1)
				array[i] = tmp;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int[][] baseball = {{123,1,1},{356,1,0},{327,2,0},{489,0,1}};
		
		int result = solution(baseball);
		
		System.out.println(result);
	}

}
