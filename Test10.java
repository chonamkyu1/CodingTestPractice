package zzpractice;

// 내적
// a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]

public class Test10 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
//		int[] a = {-1, 0, 1};
//		int[] b = {1, 0, -1};
		System.out.println(Solution(a, b));
	}
	
	
	public static int Solution(int[] a, int[] b) {
		int answer = 0;
		
		for (int i =0; i < b.length; i++) {
			answer += a[i] * b[i];
		}
		
		return answer;
	}
}
