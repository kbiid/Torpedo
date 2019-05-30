package Java;

public class baseball {

	public static int solution(int [][] baseball) {
		
		int answer = 0;
		int[] array = new int[3];
		int tmp;
		int strike,ball;
		
		for(int i=123; i<=987; i++) {
			array[0] = i/100;
			tmp = i%100;
			array[1] = tmp/10;
			tmp = i%10;
			array[2] = tmp;
			
			if(array[0] == 0 || array[1] == 0 || array[2] == 0) continue;
			if(array[0] == array[1] || array[1] == array[2] || array[2] == array[0]) continue;
			
			for(int j=0; j<baseball.length; j++) {
				
				strike = 0;
				ball = 0;
				
				int tmp2;
				int x = baseball[j][0]/100;
				tmp2 = baseball[j][0]%100;
				int y = tmp2/10;
				tmp2 = tmp2%10;
				int z = tmp2;
				
				if(x == array[0] && x != 0) strike++;
				if(y == array[1] && y != 0) strike++;
				if(z == array[2] && z != 0) strike++;
				if(strike != baseball[j][1]) break;
				
				if(x == array[1] || x == array[2] && x != 0) ball++;
				if(y == array[0] || y == array[2] && y != 0) ball++;
				if(z == array[0] || z == array[1] && z != 0) ball++;
				if(ball != baseball[j][2]) break;
				
				if(j == baseball.length-1) answer++;
				
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		int[][] baseball = {{123,1,1},{356,1,0},{327,2,0},{489,0,1}};
		
		int result = solution(baseball);
		
		System.out.println(result);
	}

}
