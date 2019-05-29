package Java;

public class Recursive {

	public static int recursiveMethod(int num) {
		if(num <= 1) 
			return 1;
		else
			return num + recursiveMethod(num-1);
		
	}
	
	public static void main(String[] args) {
		
		int num = 100;
		int sum = 0;
		
		sum = recursiveMethod(num);
		
		System.out.println(sum);
	}

}
