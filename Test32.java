package zzpractice;

// 부족한 금액 계산하기
public class Test32 {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		
		System.out.println(soltuion(price, money, count));
		
	}
	
	public static long soltuion(int price, int money, int count ) {
		long answer = 0;
		for (int i = 1 ; i <= count; i++) { // 총 반복은 4번 (카운트 수만큼)
			answer += price * i;// 3, 6, 9, 12
			System.out.println("answer : " + answer);
		}
		long result = 0;
		
		result = money - answer;
		if (result >= 0 ) {
			return 0;
		}
		//System.out.println("result: " + result);
		
		return Math.abs(result);
	}
	
}
