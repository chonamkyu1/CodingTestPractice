package zzpractice;
import java.util.*;

// 문자열 내림차순
public class Test25 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		System.out.println(solution(s));
		
	}
		// 문자열은 오름차순이 불가능하다. -> char 배열로 바꿔준다.
	
	public static String solution(String s) {
		// 문자열 배열의 인덱스별로 각 문자를 저장한다.
		//String answer = "";
		
		// toCharArray는 문자열을 하나하나 쪼개서 이를 char타입 배열에 집어넣어주는 메소드
		char arr[] = s.toCharArray();
		Arrays.sort(arr);
		// char 배열을 역순으로 바로 정렬하는 함수가 없다 -> StringBuilder 사용
		
		StringBuilder sb = new StringBuilder(String.valueOf(arr));
		
		System.out.println("sb : "   + sb);
		
		return sb.reverse().toString();
	}
}
