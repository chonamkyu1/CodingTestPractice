package zzpractice;

// 수박수박수박수박 문제
public class Test28 {
	public static void main(String[] args) {

		int n1 = 3;
		int n2 = 4;
		System.out.println(solution(n1));
		System.out.println(solution(n2));
	}
	
	public static String solution(int n) {
		String answer = "";
		
		for (int i=1; i < n; i++) { 
			if (i % 2 != 0 ) { 
				answer += "수";
			} else {
				answer += "박";
			}
		}
		
		return answer;
		
	}
//		String text = "수박수박수박수박수박수박수박수박수박수박수박수박";  // 이런 방법도 있다.
//		String answer = text.substring(0,n);
//		
//		return answer;
	
		
}
