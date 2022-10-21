/*
JadenCase 문자열 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/12951

모든 단어의 첫 문자가 대문자이고 나머지는 알파벳은 소문자인 문자열
단, 첫문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 할 것
*/
public class JadenCase_String {

	public static void main(String[] args) {
		// test case
		String s = "3people unFollowed me";
		String answer = "";
		boolean sw = true;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)) == true) { // 숫자 구분
                answer += s.charAt(i);
                sw = false;
                continue;
            }
            else if(s.charAt(i) == ' '){ // 공백을 통해 첫번째 단어인지 확인
                answer += s.charAt(i); 
                sw = true;
                continue;
            }
            if(sw == true){ // sw를 통해서 대문자, 소문자 변형
                answer += Character.toUpperCase(s.charAt(i));
                sw = false;
            }else{
                answer += Character.toLowerCase(s.charAt(i));
            }
        }
        // return test
        System.out.println(answer);
        return ;

	}

}
