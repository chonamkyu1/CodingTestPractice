package zzpractice;

import java.util.Arrays;

import util.ArrayUtil;

public class Test2 {
	public static void main(String[] args) {
		
		// num 배열 오름차순 정렬
		
		int num[] = { 4, 6, 20, 49, 5, 0, 78 };
		
		Arrays.sort(num);
		
		for (int result : num) {
			System.out.print(result + " ");
		}
	}
}
