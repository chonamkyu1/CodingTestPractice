package zzpractice;

// 폰켓몬
import java.util.*;

public class Test14 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,1,2,3}));
		System.out.println(solution(new int[] {3,3,3,2,2,4}));
		System.out.println(solution(new int[] {3,3,3,2,2,2}));
		
	}
	
	public static int solution(int[] nums) {
		int answer = 0;
		//총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다
		int max = nums.length / 2; // 최대로 가져갈 수 있는 폰켓몬 수 
		
		// Set을 사용해서 문제를 풀 수 있다. (중복제거)
		ArrayList<Integer> kind_list = new ArrayList<>();
		
		for (int data : nums) {
			if(!kind_list.contains(data)) { // 포함해있지 않은경우에 더해준다.
				kind_list.add(data);
			}
		}
		int count = kind_list.size(); // count에 몇개가 담겨있는지
		//System.out.println("count : " + count);
		
		if (max < count) {
			answer = max;
		} else {
			answer = count;
		}
		
		return answer;
		
	}
}
