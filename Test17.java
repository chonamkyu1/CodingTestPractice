package zzpractice;

// 음양더하기
public class Test17 {
	public static void main(String[] args) {
		
		int[] absolutes1 = {4,7,12};
		boolean[] signs1 = {true, false, true};
		
		int[] absolutes2 = {1,2,3};
		boolean[] signs2 = {false, false, true};
		
		System.out.println(solution(absolutes1, signs1));
		System.out.println(solution(absolutes2, signs2));
		
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for (int i = 0; i < signs.length; i++) {
			if (signs[i] == true) {  //signs[i]가 참이면 +, signs[i]가 거짓이면 -
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		} 
		
		
		
		return answer;
		
	}
}
