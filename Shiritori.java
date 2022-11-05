/*
 * ���� �����ձ�
 * https://school.programmers.co.kr/learn/courses/30/lessons/12981
 * 
 * 1���� n���� ��ȣ�� �پ��ִ� n���� ����� ���� �����ձ�
 * 1. 1������ ��ȣ ������� ���ʴ�� �ܾ� ���ϱ�
 * 2. ������ ����� �ܾ ���ϸ� �ٽ� 1��°�� ����
 * 3. �ջ���� ���� �ܾ��� ������ ���ڷ� �����ϴ� �ܾ�
 * 4. ������ �����ߴ� �ܾ�� ����� �� ����
 * 5. �� ������ �ܾ�� ������ �� ����
 * 
 * ������ ��ȣ, ���ʷ� Ż���ڸ� ã�Ƴ� �� -> ���ٸ� 0,0 ��ȯ
 */

import java.util.*;

public class Shiritori {

	public static void main(String[] args) {
		
		//test case
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		
		int[] answer = {0,0};
        ArrayList<String> play_words = new ArrayList<>();
        
        play_words.add(words[0]); // ó�� �ܾ�� ������ ���
        
        // for���� ���� �Է� �ܾ ���� ������ ����
        for(int i=1; i<words.length; i++){
            // ���� ù�ܾ�� �� �ܾ��� ���κ��� ��
            if(words[i].charAt(0) != play_words.get(i-1).charAt(play_words.get(i-1).length()-1)){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                return ;
            }
            
            // ArrayList contain �Լ��� ���Ͽ� ������ �ܾ �־����� Ȯ��
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
