/*
 * 점프와 순간이동
 * https://school.programmers.co.kr/learn/courses/30/lessons/12980
 * 한번에 K칸을 점프하거나 현재 온 거리만큼 * 2 위치로 순간이동을 할 수 있을 때
 * 순간이동을 하면 전력이 줄어들지 않지만 점프를 하면 전력이 줄어든다 최대한 효율적인 방법을 반환하시오
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
