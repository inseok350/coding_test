/*
 * 멀리 뛰기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12914
 * 한번에 1칸 or 2칸 점프가 가능할 때 n번까지 도달하는 방법의 개수를 1234567로 나눠 나머지를 리턴하시오
 */

import java.util.*;
public class long_jump_calc {

	public static void main(String[] args) {
		//test case 
		int n = 4;
		long answer = 0;
		
        ArrayList<Integer> rec = new ArrayList<>();
        rec.add(1);
        rec.add(2);
        for(int i=2;i<n; i++){
            rec.add((rec.get(i-2)%1234567+rec.get(i-1)%1234567)%1234567);
        }
        answer = rec.get(n-1);
        System.out.println(answer);
        return ; // answer

	}

}
