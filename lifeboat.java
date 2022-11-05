/*
 * ����Ʈ
 * https://school.programmers.co.kr/learn/courses/30/lessons/42885
 * 
 * ���ε��� ���� ������� ����Ʈ�� �̿��Ͽ� ���� ����Ʈ�� �� ���� �ִ� 2��
 * ����Ʈ�� �ִ��� ���� ����Ͽ� ��� ����� ����
 * 
 * ������� �����Ը� ���� peoples �迭�� ���� ���� ���� limit�� �Ű�����
 * ����Ʈ ������ �ּڰ��� ��ȯ
 * 
 * �ذ���
 * ArrayDeque.pollLast()�� ���� ���� remove()�� ����ϸ� �ð����⵵�� �����Ѵ�
 * ������� �����Ը� �����ϰ� ���� ���� ����� ���� ���� ����� ���Ͽ� ���� ������ �ɸ��� ���� ������ �踦 �ϳ��� �߰��ϰ�
 * �����԰� �ʰ��Ǹ� ���� ��� ����ŭ ���Ͽ� ��ȯ 
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
        while(dq.isEmpty() == false) { // �����ִ� ��� üũ
            int weight = dq.pollLast(); // ���� ���ſ� ��� Ż��
            if(dq.isEmpty() == false && weight + dq.peekFirst() <= limit) { dq.pollFirst(); }
            // ����� �����ְ� ���� ������ ����� �Բ� Ż�� ������ �� Ż��
            ans++;
        }
        System.out.println(ans);
        return ;

	}

}
