package zzpractice;

// 없는 숫자 더하기
// 0 ~ 9까지 숫자 중에 없는 숫자 더하기
public class Test15 {
	public static void main(String[] args) {
		int[] ex1 = {1,2,3,4,6,7,8,0};
		int[] ex2 = {5,8,4,0,6,7,9};
		
		System.out.println(solution(ex1)); // 5 + 9 = 14
		System.out.println(solution(ex2)); // 1 + 2 + 3 = 6
	}
	
	public static int solution(int[] numbers) {
		int answer = 0;
		boolean[] arr = new boolean[10];  // 0~ 9까지 10개의 배열 생성

//		for (int data : numbers) {
//			arr[data] = true;
//		}
		
		for (int i = 0; i < numbers.length; i++) {
			arr[numbers[i]] = true;
		}
		
		for (int i =0; i < arr.length; i++) {
			if(!arr[i]) {
				answer +=i;
			}
		}
		return answer;
		
	}
}
