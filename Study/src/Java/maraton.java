package Java;

import java.util.Arrays;

public class maraton {

	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i=0;
        
        for(i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i]))
                return participant[i];
        }
        return participant[i];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] participant = {"mislav","stanko","mislav","ana"};
		String[] completion = {"stanko","ana","mislav"};

		System.out.println(solution(participant,completion));
		
	}

}
