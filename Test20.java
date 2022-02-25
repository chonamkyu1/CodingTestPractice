package zzpractice;

// 문자열을 정수로 바꾸기
public class Test20 {
	public static void main(String[] args) {
		String s1 = "1234";
		String s2 = "-1234";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}
	
	public static int solution(String s) {
		int answer = 0;
		
		answer = Integer.parseInt(s);  // 문자열을 정수로 바꾸는 
		
		return answer;
		
		
	}
}
