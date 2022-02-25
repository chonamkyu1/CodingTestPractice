package zzpractice;

// 약수의 합 
public class Test19 {
	public static void main(String[] args) {
		int n1 = 12;
		int n2 = 5;
		
		System.out.println(solution(n1));
		System.out.println(solution(n2));
	}
	
	public static int solution(int n) {
		int answer = 0;
		
		for (int i=1; i <= n; i++ ) {
			if (n % i == 0) {
				answer += i; // 12라고 하면 1 + 2 + 3 + 4 + 6 + 12 = 28
			}
		}
		
		return answer;
	}
	
}
