package zzpractice;

// 약수의 갯수와 덧셈
public class Test16 {
	public static void main(String[] args) {
		int left1 = 13;
		int rigth1 = 17;
		int left2 = 24;
		int rigth2 = 27;
		
		System.out.println(solution(left1, rigth1));
		System.out.println(solution(left2, rigth2));
	}
	
	public static int solution(int left, int right) {
		int answer = 0;
		
		for (int i = left; i <= right; i++) {  // left : 13, rigth 17 일떄
			int count = 0;
			
			for (int j=1; j <= i; j++) {  
				if (i % j == 0) {  // 약수 찾기
					count ++;
				}
			}
			
			// 약수의 갯수가 짝수일때 수를 더하고 홀수일떄 수를 뺀다
			if (count % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
			
		}
		
		return answer;
	}
}
