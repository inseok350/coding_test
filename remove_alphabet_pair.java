/*
 * ¦���� �����ϱ�
 * https://school.programmers.co.kr/learn/courses/30/lessons/12973
 * 
 * ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��� �ް� 2�� �پ��ִ� ¦�� ã�� �� ���� ������ �� �յڷ� ���ڿ��� �̾� ���δ�
 * �� ������ �ݺ��Ͽ� ���ڿ��� ��� �����Ѵٸ� ¦���� �����ϱⰡ ���� �����ϸ� 1, �����ϸ� 0�� ��ȯ�� ��
 * 
 * �ذ���
 * ������ �ڿ� ���ڿ��� �̾� ������ �ʴ��� ����� �����°� �߿��ϱ� ������ ������ ����Ͽ� peek�� ���� ������ ��� peek�� �����ϴ� ����� ����Ѵ�
 * -> �̷��� ����� ������ġ�� �� ģȭ���̶�� �����Ѵ�
 */
import java.util.*;
public class remove_alphabet_pair {
	public static void main(String[] args) {
		//test case
		String s = "baabaa";
		
		int answer = -1;
        int count = 0; // ���ڸ� ���� index�� �����ϰ� ���� ��� ���� ����
        
        Stack<Character> dual = new Stack<>();
        
        while(count < s.length()){
            if(dual.empty()){ // ������ ����ִٸ� ���� ���� ���⶧���� ���� ���� ����
                dual.push(s.charAt(count));
            }else if(dual.peek() == s.charAt(count)){ // peek�� ���� ���� �� 
                dual.pop();
            }else{
                dual.push(s.charAt(count));
            }
            count ++;
        }
        if(dual.empty()){  // ������ ����ִ� ä�� �����ٸ� ����
            answer = 1;
            System.out.println("����");
        }else{
            answer = 0;
            System.out.println("����");
        }
       
        return; // answer
	}
}
