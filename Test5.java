package zzpractice;

public class Test5 {
	// 아래 코드를 효율적으로 바꾸기
	 
//	public static void main(String[] args) {
//		System.out.println(func1());
//		System.out.println(func2());
//		System.out.println(func3());
//	}
//
//	public static String func1() {
//		return "func1";
//	}
//
//	public static String func2() {
//		return "func2";
//	}
//
//	public static String func3() {
//		return "func3";
//	}
	
	public static void main(String[] args) {
		func1();
	}

	public static String func1() {
		System.out.println("func1");
		return func2();
	}

	public static String func2() {
		System.out.println("func2");
		return func3();
	}

	public static String func3() {
		System.out.println("func3");
		return null;
		
		
	}
}

