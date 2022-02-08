package zzpractice;

public class Test1 {

	public static void main(String[] args) {
		
		// 문제 str1과 str2를 사용하여 Good + morning 출력
		
		String str1 = "Good+Bad";
		String str2 = "evening+morning";
		
		int idx1 = str1.indexOf("+");
		int idx2 = str2.indexOf("+");
		
		System.out.println("idx1: " + idx1); // Good 알파벳 갯수 4개
		System.out.println("idx2: " + idx2); // evening 알파벳 갯수 7개
		
		String str3 = str1.substring(0,idx1) + str2.substring(idx2, str2.length());
		
		System.out.println("result : " + str3);
		
			
		
	}

}
