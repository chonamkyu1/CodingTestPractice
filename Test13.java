package zzpractice;

// 소수 만들기
public class Test13 {
	public static void main(String[] args) {
		int[] result1 = {1,2,3,4};
		int[] result2 = {1,2,7,6,4};
		
		System.out.println(Solution(result1));
		System.out.println(Solution(result2));
	}
	
	public static int Solution(int[] nums) {
		//int answer = -1;
		int answer = 0;
		
		for (int i = 0; i<nums.length; i++) {   
			for (int j=i+1; j<nums.length;j++) {  
				for(int k=j+1; k<nums.length;k++) {  
					if (isPrime(nums[i] + nums[j] + nums[k])) { // 경우의 수를 찾아서
						answer++; 	 // 소수가 맞을경우 ++
					}
				}
			}
		}
		return answer;
	}
	
	// 소수 판단
	public static boolean isPrime(int num) {  
		boolean result = true;
		
		for (int i=2; i< num; i++ ) { 	
			
			if (num % i == 0) {		 // 나눠 떨어지는 경우
				result = false;
				System.out.println("result : " + result);
				break;
			}
		}
		
		return result; // 나눠 떨어지지 않는 경우
	}
	
}
