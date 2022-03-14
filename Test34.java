package zzpractice;

// 평균 구하기
public class Test34 {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,5};

		System.out.println(solution(arr1));  // 2.5가 나와야한다
		System.out.println(solution(arr2));  // 5가 나와야한다.
	}
	
	public static double solution(int[] arr) {
		double answer = 0;

		// 개선된 for문
//		for (int i : arr) {
//			answer += i;
//			System.out.println("answer : " + answer);
//		}
		
		double sum  = 0;
		for(int i=0; i <arr.length; i++ ) {
			sum += arr[i];
			System.out.println("sum : " + sum);
			
		}
		answer = sum / arr.length;
		
		return answer;
	}
}
