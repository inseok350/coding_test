/*
 * ������ �����̵�
 * https://school.programmers.co.kr/learn/courses/30/lessons/12980
 * �ѹ��� Kĭ�� �����ϰų� ���� �� �Ÿ���ŭ * 2 ��ġ�� �����̵��� �� �� ���� ��
 * �����̵��� �ϸ� ������ �پ���� ������ ������ �ϸ� ������ �پ��� �ִ��� ȿ������ ����� ��ȯ�Ͻÿ�
 * 
 */
import java.util.*;

public class jump_and_telpo {

	public static void main(String[] args) {
		
		//test case
		int n = 5;
		
		int ans = 0;
        int num = n;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
            }else{
                ans = ans + num % 2;
                num = num - (num % 2);
            }
        }
        System.out.println(ans);
        return ;
	}

}
