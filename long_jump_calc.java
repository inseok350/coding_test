/*
 * �ָ� �ٱ�
 * https://school.programmers.co.kr/learn/courses/30/lessons/12914
 * �ѹ��� 1ĭ or 2ĭ ������ ������ �� n������ �����ϴ� ����� ������ 1234567�� ���� �������� �����Ͻÿ�
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
