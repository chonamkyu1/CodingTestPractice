package zzpractice;

import java.util.Arrays;

// 프로그래머스 K번째 수 구하기
public class Test7 {
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}, {2,3,1}}; // 0번 인덱스 {i=2, j=5, k=3}
							
		// 5,2,6,3 -> 2,3,5,6 3번쨰 값 = 5
		// 6 -> 6 1번째 값  = 6
		// 1,5,2,6,3,7,4 -> 1,2,3,4,5,6,7 3번째값 = 3
		// 5, 2 -> 2,5 1번째값 = 2
		int[] result = solution(array, commands);
		System.out.println(Arrays.toString(result));
	}
	 public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length]; // 3
	        
	        for (int i = 0;  i < commands.length; i++) {
	        	int temp[] = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	        	// arrays (배열) , 시작지점 , 끝지점
	        	// (array: 1,5,2,6,3,7,4), (i번째부터 2, 4, 1)값 중 -1을 하는 이유는 2번째 자리 => 인덱스 = 1 , (j번째까지)
	        	// commands[0][0] = 2, commands[1][0] = 4, commands[2][0] = 1 -> i값
	        	// commands[0][1] = 5, commands[1][1] = 4, commands[2][1] = 7 -> j값
	        	// commands[0][2] = 3, commands[1][2] = 1, commands[2][2] = 3 -> k값

	        	
	        	// Arrays.compyOfRange(in[] original, int from, int to) 메서드는 지정된 범위의 끝자리는 포함하지
	        	// 않기 때문에 마지막 to 값은 원하는 끝 자릿수 + 1을 해줘야한다.
	        	Arrays.sort(temp);
	        	answer[i] = temp[commands[i][2] -1];
	        }
	        return answer;
    }
}
