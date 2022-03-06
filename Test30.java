package zzpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test30 {
	public static void main(String[] args) {
		String[] string1 = {"sun", "bed", "car"};
		String[] string2 = {"abce", "abcd", "cdx"};
		
		System.out.println(Arrays.toString(solution(string1, 1)));
		System.out.println(Arrays.toString(solution(string2, 2)));
		
	}
	
	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		
		ArrayList<String> list = new ArrayList<>();
		
		// 1. 단어의 n번째 문자열을 단어의 맨 앞에 붙인다.
		for (int i = 0; i< strings.length; i++ ) {
			list.add(strings[i].charAt(n) + strings[i]);
		}
		
		System.out.println("n번째 단어 붙인 list : " + list);
		
		// 2. 리스트의 문자열을 정렬한다.
		Collections.sort(list);
		
		System.out.println("정렬 후 list : " + list);
		
		
		// 리스트를 배열로 변환
		answer = new String[list.size()];
		
		// 3. 맨 앞에 붙여진 문자를 없애고 배열에 넣어준다.
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).substring(1); // 0빼고 1부터 끝까지!!
		}
		
		return answer;
	}
	
}
