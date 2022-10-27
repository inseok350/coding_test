/*
 * 구명보트
 * https://school.programmers.co.kr/learn/courses/30/lessons/42885
 * 
 * 무인도에 갇힌 사람들을 구명보트를 이용하여 구출 구명보트는 한 번에 최대 2명씩
 * 구명보트를 최대한 적게 사용하여 모든 사람을 구출
 * 
 * 사람들의 몸무게를 담은 peoples 배열과 배의 무게 제한 limit가 매개변수
 * 구명보트 개수의 최솟값을 반환
 * 
 * 해결방법
 * ArrayDeque.pollLast()를 쓰는 이유 remove()를 사용하면 시간복잡도가 증가한다
 * 사람들의 몸무게를 정렬하고 제일 적은 사람과 제일 많은 사람을 합하여 무게 제한이 걸리지 않을 때까지 배를 하나씩 추가하고
 * 몸무게가 초과되면 남은 사람 수만큼 더하여 반환 
 * 
 * 
 */

import java.util.*;

public class lifeboat {

	public static void main(String[] args) {
		
		//test case
		int[] peoples = {70, 50, 80, 50};
		int limit = 100;
		
		Arrays.sort(peoples);
        ArrayDeque<Integer> dq = new ArrayDeque<>(50000);
        for(int x : peoples) dq.add(x);

        int ans = 0;
        while(dq.isEmpty() == false) { // 남아있는 사람 체크
            int weight = dq.pollLast(); // 제일 무거운 사람 탈출
            if(dq.isEmpty() == false && weight + dq.peekFirst() <= limit) { dq.pollFirst(); }
            // 사람이 남아있고 제일 가벼운 사람이 함께 탈출 가능할 시 탈출
            ans++;
        }
        System.out.println(ans);
        return ;

	}

}
