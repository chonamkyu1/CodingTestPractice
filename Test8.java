package zzpractice;


// 프로그래머스 체육복문제
public class Test8 {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		System.out.println(Solution(n, lost, reserve));
	
	}
	
	public static int Solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		// 1. 학생들 배열 생성
		int[] students = new int[n+2];  // +2를 하는 이유는 앞, 뒤로 확인해 주려는 것과 넉넉하게 잡기 위해서
		
		// 2. reserve / lost 정보 반영 -> res 1, lost -1 
		for (int r : reserve) {
			students[r] ++;
		}
		for (int l : lost) {
			students[l] --;
		}
			// 0	1	2	3	4	5	6
			// 0	1	-1	1	-1	1	0
		
		// 3. 여분을 기준으로 앞, 뒤 확인하여 없는 학생 체육복을 빌려준다.
		for (int i = 1; i <=n; i++) { // for문 돌릴때 i = 1값부터 돌려줘야한다. 
			if(students[i] == 1) {  
				if(students[i-1] == -1) {
					students[i] --;
					students[i-1] ++;
				} else if (students[i+1] == -1) {
					students[i] --;
					students[i+1] ++;
				}
			}
		}
		// 4. 체육복을 갖고있는 학생수를 확인한다.
		for (int i=1; i<=n; i++ ) {
			if (students[i] >= 0) {
				answer ++;
			}
		
		}
		
		return answer;
	}
}
