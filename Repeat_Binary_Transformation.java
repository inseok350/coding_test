/*
 * 이진 변환 반복하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/70129
 * 0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의
 * 1. x의 모든 0을 제거
 * 2. x의 길이를 c라고 하면, "C를 2진법으로 표현한 문자열"로 바꾼다
 * 이진 변환 횟수와 제거된 모든 0의 개수를 각각 배열에 담아 return
*/

public class Repeat_Binary_Transformation {

	public static void main(String[] args) {
		//test case 값
		String s = "110010101001";
		
		int[] answer = {0,0};
        int one_count;
        while(s.length() > 1){
            one_count = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0') {answer[1]++;}
                else {one_count++;}
            }
            s = Integer.toBinaryString(one_count);
            answer[0]++;
        }
        for (int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        return; //answer

	}

}
