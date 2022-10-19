// H - Index
// https://school.programmers.co.kr/learn/courses/30/lessons/42747

/*
어떤 과학자가 발표한 논문 n편 중 h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값은 H-Index가 된다
 */

public class h_index {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5}; // 테스트 케이스
		int answer = 0;
		int count;
		for(int i=1; i<=citations.length; i++){
            count = 0;
            for(int c : citations){
                if(c >= i ) count++;
            }
            if(count >= i) answer = i;
        }
		System.out.println(answer);
        return ;

	}

}
