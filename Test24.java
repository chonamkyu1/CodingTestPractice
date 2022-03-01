package zzpractice;
import java.util.*;

// 같은 숫자는 싫어
public class Test24 {
	public static void main(String[] args) {
		int[] arr1 = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3,};
		
		System.out.println(Arrays.toString(solution(arr1)));
		System.out.println(Arrays.toString(solution(arr2)));
	}
	
	public static int[] solution (int[] arr) {
		int[] answer = {};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num = -1;   // 0 ~ 9 이외에 숫자
		
		for (int i=0; i < arr.length; i++) {
			if (arr[i] != num) {
				list.add(arr[i]);
				num = arr[i];
				
//				System.out.println("num : " + num); 
			}
		}
		answer = new int[list.size()];   
		
		for (int i=0; i<answer.length; i++) {
			answer[i] = list.get(i);  // 배열에 다시 저장
		}
		
		return answer;
	}
}
