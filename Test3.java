package zzpractice;

public class Test3 {
	public static void main(String[] args) {
		
		// 아래의 소스 출력 결과는 ??
		
		String result = "";
		//int result = 0;
		int score = 1;
		
		for (int i = 1; i <=10; i++) {
			result += score;
			System.out.println("result : " + result);
		}
		
//		if (result == 10 ) {
//			System.out.println("success :10 ");
//		} else if (result == 9) {
//			System.out.println("success: 9 ");
//		} else
//			System.out.println("success " + result);
	}
	
	// 애초에 오류가 난다. 왜냐하면 result는 String 타입인데 int 비교 자체가 성립 X
	
}
