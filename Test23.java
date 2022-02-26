package zzpractice;

// 시저암호
// 문자열에 숫자값 n을 매개변수로 넣어주면 그 값만큼 이동한 값 출력

public class Test23 {
	public static void main(String[] args) {
//		char test = 'c';
//		System.out.println(test); //c
//		System.out.println((int)test); //99
//		char test2 = (char)(test+2); 
//		System.out.println( test+2); //101
//		System.out.println(test2); //e
		
		String s1 = "AB";
		String s2 = "z";
		String s3 = "a B z";
		
		System.out.println(solution(s1, 1));
		System.out.println(solution(s2, 1));
		System.out.println(solution(s3, 4));
		
	}
	
	public static String solution(String s, int n) {
		String answer = "";

		for (int i=0; i < s.length(); i++) {
			char alphabet = s.charAt(i);
			
			if(alphabet >= 'a' && alphabet <= 'z') {
				if (alphabet + n > 'z') { 
					answer += (char)(alphabet + n - 26); // z다음으로 다시 a로 넘어가기 때문에 -26 해주기
				} else {
					answer += (char)(alphabet + n);
				}
			} else if (alphabet >= 'A' && alphabet <= 'Z') {
				if (alphabet + n > 'Z') {
					answer += (char)(alphabet+ n - 26);
				} else {
					answer += (char)(alphabet + n);
				}
			} else answer += (char)alphabet;
			
		}
		 
		return answer;
	}
}
