package zzpractice;

// 문자열 내 p와 y의 갯수
public class Test31 {
	public static void main(String[] args) {
		String s1 = "pPoooyY";
		String s2 = "Pyy";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		
	}
	
	public static boolean solution(String s) {
		boolean answer = true;
		
		int p = 0;
		int y = 0;
		
		for (int i=0; i < s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				p++;
			}
			if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				y++;
			}
		}
		
		if ( p == y) {
			answer  = true;
		} else {
			answer  = false;
		}
		
		return answer;
	}
}
