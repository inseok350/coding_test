/*
올바른 괄호
https://school.programmers.co.kr/learn/courses/30/lessons/12909

괄호가 올바르게 짝지어졌는지 check

 */

import java.util.Stack;


public class bracket_check {

	public static void main(String[] args) {
		// test case
		String s = "()()";
		boolean answer = true;
        int count = 0;
        Stack<Integer> stack = new Stack<>(); // 스택 사용
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == ')'){
                if(stack.empty() == true){ // 맨 처음에 비어있을 때 괄호가 끝났다면 오류
                    answer = false;
                    break;
                }
                stack.pop(); // )를 받고 스택 카운트가 남아있다면 비우고 카운트를 낮춘다
                count--;
            }else if (s.charAt(i) == '('){ // 스택 삽입
                stack.push(count);
                count++;
            }
        }
        if(count != 0){ // 마지막에 카운트가 남아있지 않다면 오류 없음
            answer = false;
        }
        
        System.out.println(answer);
        return ;

	}

}
