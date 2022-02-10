package zzpractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test6 {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		// HashMap 생성
		// HashMap 빼기
		// value값이 0이 아닌 마지막 주자를 찾는다.
		HashMap<String, Integer> map = new HashMap<>();
		for (String player : participant) {  // participant 참가자 생성
			map.put(player, map.getOrDefault(player, 0) + 1); // 동명이인이 있을 수 있기 때문에 + 1 -> 총 값은 1이나 2,3(동명이인포함)
			System.out.println("participant map : " + map);  // leo=1, eden=1, kiki=1
		}
		for (String player : completion) {  // completion 완주자 생성
			map.put(player, map.get(player) -1);  // 참가한 사람에서 완주한 사람 (-1 을 빼줘서 0이 아닌 사람을 찾는다.)
			System.out.println("completion map : " + map); // leo=1, enen=0, kiki=0
		}
		Iterator<Map.Entry<String, Integer>> ite = map.entrySet().iterator();

		while (ite.hasNext()) {
			Map.Entry<String, Integer> entry = ite.next();
			if (entry.getValue() != 0) {  // 값이 0이 아닌 사람 찾기 0 = 완주자 , 1= 완주하지 못한자
				answer = entry.getKey();
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] part = { "leo", "kiki", "eden" };
		String[] comp = { "eden", "kiki" };
		Test6 sol = new Test6();
		System.out.println(sol.solution(part, comp));
	}
}


