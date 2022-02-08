package zzpractice;

public class Test4 {
	public static void main(String[] args) {
		
		// 아래의 소스 출력결과 확인
		
		// getName() -> 이렇게 출력했을 시에는 parent값 반환
		// getName("child") -> 이렇게 출력했을 시에는 child값 반환
		Job obj = new Developer("parent");

		System.out.println(obj.getName());
		System.out.println(obj.getName("child"));
	}

}

abstract class Job {
	String name;

	abstract public String getName(String val);

	public String getName() {
		return "Job name : " + name;
	}
}

class Developer extends Job {
	public Developer(String val) {
		name = val;
	}

	public String getName(String val) {
		return "Developer name : " + val;
	}

	public String getName(byte val[]) {
		return " Developer name : " + val;
	}

}
