/*
�ùٸ� ��ȣ
https://school.programmers.co.kr/learn/courses/30/lessons/12909

��ȣ�� �ùٸ��� ¦���������� check

 */

import java.util.Stack;


public class bracket_check {

	public static void main(String[] args) {
		// test case
		String s = "()()";
		boolean answer = true;
        int count = 0;
        Stack<Integer> stack = new Stack<>(); // ���� ���
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == ')'){
                if(stack.empty() == true){ // �� ó���� ������� �� ��ȣ�� �����ٸ� ����
                    answer = false;
                    break;
                }
                stack.pop(); // )�� �ް� ���� ī��Ʈ�� �����ִٸ� ���� ī��Ʈ�� �����
                count--;
            }else if (s.charAt(i) == '('){ // ���� ����
                stack.push(count);
                count++;
            }
        }
        if(count != 0){ // �������� ī��Ʈ�� �������� �ʴٸ� ���� ����
            answer = false;
        }
        
        System.out.println(answer);
        return ;

	}

}
