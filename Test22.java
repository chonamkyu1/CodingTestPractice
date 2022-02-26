package zzpractice;

import java.util.ArrayList;
import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class Test22 {
	public static void main(String[] args) {
		int[] arr1 = {5,9,7,10, 5};
		int[] arr2 = {2,36,1,3};
		int[] arr3 = {3,2,6};
		
		System.out.println(Arrays.toString(solution(arr1, 5))); // 배열에 담기게 값 출력
		
		for (int a1 : solution(arr1,5)) {
			System.out.println("a1 : " + a1);	// 값 하나하나 꺼내오도록 출력
		}
		
		}
		
		// 	배열 길이 구하기
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
//				System.out.println("list : " + list);
			}
		}
		if (list.isEmpty()) {
			list.add(-1);
		}

//		System.out.println(list.size());
		
		answer = new int [list.size()];
		
		for (int i=0; i < list.size(); i++) {
			answer[i] = list.get(i);
//					System.out.println("list.get(i) : " + list.get(i));
			
		}
		
		System.out.println(Arrays.toString(answer));	// 오름차순 정렬 전
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));	// 오름차순 정렬 후
		
		return answer;
	}
}
