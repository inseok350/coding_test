/*
 * 영어 끝말잇기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12981
 * 
 * 1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기
 * 1. 1번부터 번호 순서대로 차례대로 단어 말하기
 * 2. 마지막 사람이 단어를 말하면 다시 1번째로 시작
 * 3. 앞사람이 말한 단어의 마지막 문자로 시작하는 단어
 * 4. 이전에 등장했던 단어는 사용할 수 없다
 * 5. 한 글자인 단어는 인정할 수 없다
 * 
 * 정답은 번호, 차례로 탈락자를 찾아낼 것 -> 없다면 0,0 반환
 */

import java.util.*;

public class Shiritori {

	public static void main(String[] args) {
		
		//test case
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		
		int[] answer = {0,0};
        ArrayList<String> play_words = new ArrayList<>();
        
        play_words.add(words[0]); // 처음 단어는 무조건 통과
        
        // for문을 통해 입력 단어가 끝날 때까지 루프
        for(int i=1; i<words.length; i++){
            // 현재 첫단어와 전 단어의 끝부분을 비교
            if(words[i].charAt(0) != play_words.get(i-1).charAt(play_words.get(i-1).length()-1)){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                return ;
            }
            
            // ArrayList contain 함수를 통하여 동일한 단어가 있었는지 확인
            if(play_words.contains(words[i])){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                return ;
            }
            
            play_words.add(words[i]);
            
        }
        return ;

	}

}
