package zzpractice;

// 두 정수 사이의 합
public class Test21 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		int a1 = 3;
		int b1 = 3;
		
		int a2 = 5;
		int b2 = 3;
		
		System.out.println(solution(a, b));
		System.out.println(solution(a1, b1));
		System.out.println(solution(a2, b2));
	}
	
	public static long solution(int a, int b) {
		long answer = 0;
		
		int min = 0;
		int max = 0;
		
		if (a == b) {
			return a;
		} else if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		for (int i=min; i <= max; i++) {
			answer += i;
		}
		
		
		return answer;
	}
}
