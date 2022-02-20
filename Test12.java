package zzpractice;

import java.util.Arrays;

// 프로그래머스 예산
public class Test12 {
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};  
		int budget = 9;	// 예산이 총 9원인데 인덱스값 4개만 넘어가면 10이상 값만 출력이된다. -> 고로 결과값은 3
		System.out.println(Solution(d,budget));
		
		int[] d1 = {2,2,3,3};
		int budget1 = 10;
		System.out.println(Solution(d1, budget1));
	}
	
	public static int Solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d); // 오름차순 정렬
		//System.out.println(Arrays.toString(d));
		
		for (int i=0; i < d.length; i++) {
			budget -= d[i];
			if (budget < 0) {
				break;
			}
			answer ++;
		}
		return answer ;
	}
}
