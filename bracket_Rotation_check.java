// 괄호 회전하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76502
// 괄호 문자열을 최대 문자열의 길이미만까지 이동하여 괄호가 올바르게 적용된 횟수를 세는 프로그램
// 1. 0 ~ s.length-1까지 회전하는 반복문
// 2. Stack을 통하여 올바른지 확인하고 카운트
// 추가 문자열의 길이가 홀수일경우 올바르지 않는 문자열로 처리할 것
import java.util.Stack;

public class bracket_Rotation_check {

	public static void main(String[] args) {
		int answer = 0;
		String s = "[](){}"; // 테스트 케이스
        if(s.length() % 2 == 1){ // 문자열이 홀수면 불합격
            return ;
        }
        String temp_s = s;
        char temp_c;
        int count;
        Stack<Character> bracket_stack = new Stack<>();
        for(int i=0; i<temp_s.length()-1; i++){ // 문자열을 회전
            count = 0;
            for(int j=0; j<temp_s.length()-1; j++){ // 문자열이 올바른지 체크
                temp_c = temp_s.charAt(j);
                if(temp_c == '[' || temp_c == '(' || temp_c == '{' ) { // 괄호의 시작은 무조건 push
                    bracket_stack.push(temp_c); count++; continue;}
                else if(bracket_stack.empty()) {break;} // stack이 비어있을 때 괄호가 닫힌다면 올바르지 않은 문자열이기 때문에 탈출
                // 문자열이 닫힐 때 stack의 제일 위에 있는 peek 값과 짝이 맞는지 확인
                else if (temp_c == ']' && bracket_stack.peek() == '[') {
                    bracket_stack.pop(); count++; continue;}
                else if (temp_c == '}' && bracket_stack.peek() == '{') {
                    bracket_stack.pop(); count++; continue;}
                else if (temp_c == ')' && bracket_stack.peek() == '(') {
                    bracket_stack.pop(); count++; continue;}
                break; // 여기까지 실행된다면 괄호가 닫히지만 일치하지 peek값과 일치하지 않기때문에 올바르지 않은 문자열로 판단
            }
            if(count == temp_s.length()-1) {answer++;} // 위의 반복문에서 끝까지 짝이 맞았다면 올바른 문자열 count를 올린다
            bracket_stack.clear(); // stack 초기화
            temp_s = temp_s.substring(1) + temp_s.charAt(0);  
        }
        System.out.println(answer);
        return ; // answer 값을 return

	}

}
