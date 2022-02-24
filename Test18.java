package zzpractice;

// 가운데 글자 가져오기
public class Test18 {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "qwer";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		
	}
	// substring 를 사용하면 (1,5) 라고 했을떄 -> 1,2,3,4 값을 반환
	
	
	public static String solution(String s) {
		String answer = "";

		if (s.length() % 2 == 0) { // 짝수라면 
			answer = s.substring(s.length()/2-1, s.length()/2+1);
		} else {  // 홀수라면
			answer = s.substring(s.length()/2, s.length()/2+1);
		}
		
		return answer;
	}
}
