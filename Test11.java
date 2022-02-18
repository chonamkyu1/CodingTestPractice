package zzpractice;
import java.util.*;

// 두개 뽑아서 더하기
public class Test11 {

	public static void main(String[] args) {
		int[] result = {2,1,4,5,3,6};
		
		//int[] result = Solution(new int[]{1,2,3,4,5,6});
		System.out.println(Arrays.toString(Solution(result)));
		
	}
	
	public static int[] Solution(int[] numbers) {
		List<Integer> list = new ArrayList<>();
		int result = 0;
		
		for (int i=0; i < numbers.length; i++) {
			for(int j=i+1; j < numbers.length; j++) {
				result = numbers[i] + numbers[j];
				if(!list.contains(result)) {
					list.add(result);
					System.out.println(result);
				}
			}
		}
		int[] answer = new int[list.size()]; 
		for (int i=0; i < list.size(); i++) {
			answer[i] = list.get(i);  // [3,6,7,5,8,4,9,10,11]
			//System.out.println(list);
		}
		Arrays.sort(answer);
		
		return answer;
	}
}
