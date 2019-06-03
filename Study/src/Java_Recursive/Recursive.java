package Java_Recursive;

public class Recursive {

	protected int recursiveMethod(int num) {
		if(num <= 1) 
			return 1;
		else
			return num + recursiveMethod(num-1);
		
	}

}
