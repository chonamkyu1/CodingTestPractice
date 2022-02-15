package zzpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test9 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(Solution(new int[] {1, 2, 3, 4, 5})));
		System.out.println(Arrays.toString(Solution(new int[] {1, 3, 2, 4, 2})));
	}
	
	public static int[] Solution(int[] answers) {
		int[] a = {1,2,3,4,5};  
		int[] b = {2,1,2,3,2,4,2,5};
		int[] c = {3,3,1,1,2,2,4,4,5,5};
		int[] cnt = {0, 0, 0};
		
		for (int i = 0; i < answers.length; i++) {
			if (a[i % 5] == answers[i]) {
				cnt[0]++;
			} 
			if (b[i % 8] == answers[i]) {
				cnt[1]++;
			}
			if (c[i % 10] == answers[i]) {
				cnt[2]++;
			}
		}
		int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2])); // 가장 높은 점수 찾기 (cnt[1],cnt[2] 번 비교 후 높은 숫자랑 cnt[0]이랑 비교)
		
		List<Integer> list = new ArrayList<Integer>();  // List 배열에 담아준다.
		
		// 가장 높은 점수를 받은 사람을 찾는 것
		if (max == cnt[0]) {
			list.add(1);
		}
		if (max == cnt[1]) {
			list.add(2);
		}
		if (max == cnt[2]) {
			list.add(3);
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i< list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
