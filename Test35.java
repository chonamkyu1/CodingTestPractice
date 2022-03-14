package zzpractice;

import java.util.*;

// 제일 작은 수 제거하기
public class Test35 {

	public static void main(String[] args) {
		int[] arr1 = {4,3,2,1};
		int[] arr2 = {10};
		
		System.out.println(Arrays.toString(solution(arr1))); // 4,3,2 가 출력
		System.out.println(Arrays.toString(solution(arr2))); // -1이 출력
	}
	
	public static int[] solution(int[] arr) {
		int[] answer = {};
	
		// 배열 길이가 1인 경우
		if (arr.length == 1) {
			answer = new int[] {-1};
			
			return answer;
		}
		
		// 배열길이가 1보다 클 떄
		// 가장 작은 수를 뺀 길이로 초기화
		answer = new int[arr.length -1];
		
		int min = arr[0]; // 하나의 값을 기준으로 잡는다.
		
		// 제일 작은 수 구한다.
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);  // 최소값을 구해라 ! arr[i] 중에
		}
		
		System.out.println("최솟값 min : " + min);
		
		int index = 0;
		
		// 가장 작은 수를 제외한 배열 만들기
		for (int i=0; i < arr.length; i++ ) {
			// 배열의 값이 가장 작은 수라면
			if (min == arr[i]) {
				continue; // continue를 이용해 배열에 넣지 않고 넘긴다.
			}
			
			answer[index] = arr[i];
			index ++;
		}
		
		
		return answer;
	}

}
