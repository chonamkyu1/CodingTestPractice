package zzpractice;

// 문자열 다루기 기본
public class Test26 {
	public static void main(String[] args) {
		String s1 = "a234";
		String s2 = "1234";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}
	
	public static boolean solution(String s) {
		boolean answer = true;
		
		// 길이가 4또는 6인지
		if (s.length() == 4 || s.length() == 6) {
			
			// 모든 숫자로 이루어져 있는지
			for (int i=0; i < s.length(); i++) {
				if (s.charAt(i) < '0' || s.charAt(i) > '9') {
					return false;
				}
			}
		} else {
			return false;
		}
		return answer;
	}
}
