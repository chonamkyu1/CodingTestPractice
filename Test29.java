package zzpractice;

// 2016년
public class Test29 {
	public static void main(String[] args) {
		
		System.out.println("요일 : " + solution(1,1));
		System.out.println("요일 : " + solution(1,22));
		System.out.println("요일 : " + solution(2,1));
		System.out.println("요일 : " + solution(2,5));
		
	}
	
	// 2016년 1월 1일은 금요일 
	// 2016년 a월 b일은 ??요일
	
	public static String solution(int a, int b) {
		String answer = "";
		String[] day = {"FRI", "SAT","SUN", "MON", "TUE", "WED", "THU"  };
		int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};

		int totalDate = 0;
		
		for (int i = 0; i < a - 1 ; i++) {  // a값이 11월꺼가지 335일을 더하고 b값을 따로 추가해줘서 -> 해당 달이 포함되지 않아야해서 -1을 해줘야 한다.
											// 7월이라면 6월까지계산
			totalDate += date[i];
			
			System.out.println("totalDate : " + totalDate);
			
		}
		totalDate += b - 1 ;  	// 해당 당일은 포함되지 않아야해서 -1을 해줘야 한다. // 1월 2일은 토요일
								// -1을 안하면 1월 1일도 하루 지난걸로 계산해서 금요일이 아니라 토요일로 뜬다
		
		answer = day[totalDate % 7]; 
		
		return answer;
	}
}

