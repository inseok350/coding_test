/*
 * 짝지어 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12973
 * 
 * 알파벳 소문자로 이루어진 문자열을 받고 2개 붙어있는 짝을 찾아 그 둘을 제거한 뒤 앞뒤로 문자열을 이어 붙인다
 * 이 과정을 반복하여 문자열을 모두 제거한다면 짝지어 제어하기가 종료 성공하면 1, 실패하면 0을 반환할 것
 * 
 * 해결방법
 * 제거한 뒤에 문자열을 이어 붙이지 않더라도 결과가 나오는게 중요하기 때문에 스택을 사용하여 peek와 같은 문자일 경우 peek를 제거하는 방법을 사용한다
 * -> 이러한 방법이 저장장치에 더 친화적이라고 생각한다
 */
import java.util.*;
public class remove_alphabet_pair {
	public static void main(String[] args) {
		//test case
		String s = "baabaa";
		
		int answer = -1;
        int count = 0; // 문자를 뽑을 index를 관리하고 루프 제어를 위한 변수
        
        Stack<Character> dual = new Stack<>();
        
        while(count < s.length()){
            if(dual.empty()){ // 스택이 비어있다면 비교할 것이 없기때문에 제일 먼저 삽입
                dual.push(s.charAt(count));
            }else if(dual.peek() == s.charAt(count)){ // peek와 다음 문자 비교 
                dual.pop();
            }else{
                dual.push(s.charAt(count));
            }
            count ++;
        }
        if(dual.empty()){  // 스택이 비어있는 채로 끝난다면 성공
            answer = 1;
            System.out.println("성공");
        }else{
            answer = 0;
            System.out.println("실패");
        }
       
        return; // answer
	}
}
