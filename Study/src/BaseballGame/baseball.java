package BaseballGame;

/*
 * 프로그래머스 숫자야구
 * */
public class baseball {

	// 숫자 야구 알고리즘 메소드
	private static int solution(int[][] baseball) {

		int answer_count = 0;
		int[] compareValue_array = new int[3];
		int[] problemValue_array = new int[3];
		int strike_count, ball_count;
		int baseball_minValue, baseball_maxValue;
		baseball_minValue = 123;
		baseball_maxValue = 987;

		//완전 탐색 알고리즘을 위한 반복문
		for (int i = baseball_minValue; i <= baseball_maxValue; i++) {
			
			compareValue_array = setArray(compareValue_array, i);

			//0이나 중복된 값이 있는지 검사
			if (compareValue_array[0] == 0 || compareValue_array[1] == 0 || compareValue_array[2] == 0)
				continue;
			if (compareValue_array[0] == compareValue_array[1] || compareValue_array[1] == compareValue_array[2]
					|| compareValue_array[2] == compareValue_array[0])
				continue;

			//정답과 입력된 값들을 비교하여 가능한 정답의 갯수를 측정
			for (int j = 0; j < baseball.length; j++) {

				strike_count = 0;
				ball_count = 0;

				problemValue_array = setArray(problemValue_array, baseball[j][0]);

				strike_count = countStrike(strike_count, compareValue_array, problemValue_array);
				if (strike_count != baseball[j][1])
					break;

				ball_count = countBall(ball_count, compareValue_array, problemValue_array);
				if (ball_count != baseball[j][2])
					break;

				if (j == baseball.length - 1)
					answer_count++;

			}
		}

		return answer_count;

	}

	private static int countStrike(int strike, int[] compareValue_array, int[] problemValue_array) {

		int strikeCount = strike;

		if (compareValue_array.length != problemValue_array.length)
			return 0;

		for (int i = 0; i < compareValue_array.length; i++) {
			for (int j = 0; j < problemValue_array.length; j++) {
				if (i == j) {
					if (problemValue_array[j] == compareValue_array[i] && problemValue_array[j] != 0)
						strikeCount++;
				}
			}
		}

		return strikeCount;
	}

	private static int countBall(int ball, int[] compareValue_array, int[] problemValue_array) {
		int ballCount = ball;

		if (compareValue_array.length != problemValue_array.length)
			return 0;

		for (int i = 0; i < problemValue_array.length; i++) {
			for (int j = 0; j < compareValue_array.length; j++) {
				if (i != j) {
					if (problemValue_array[i] == compareValue_array[j] && problemValue_array[i] != 0) {
						ballCount++;
						break;
					}
				}
			}
		}

		return ballCount;

	}

	//배열에 값을 넣어주기 위한 메소드
	private static int[] setArray(int[] array, int value) {

		int num = 1;
		int tmp;

		for (int i = 0; i < array.length - 1; i++)
			num *= 10;

		tmp = value;

		for (int i = 0; i < array.length; i++) {
			if (num >= 10) {
				array[i] = tmp / num;
				tmp = value % num;
				num /= 10;
			} else if (num == 1)
				array[i] = tmp;
		}

		return array;
	}

	public static void main(String[] args) {
		int[][] baseball = { { 123, 1, 1 }, { 356, 1, 0 }, { 327, 2, 0 }, { 489, 0, 1 } };

		int result = solution(baseball);

		System.out.println(result);
	}

}
