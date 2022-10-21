/*
 * 숫자의 표현 -> 등차 수열
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 * 
 * 
 15를 예를 들 때 아래와 같이 나타 낼 수 있다 자연수 n을 주어질 때 연속된 자연수 n을 표현하는 방법의 수를 return
 1 + 2 + 3 + 4 + 5 = 15
 4 + 5 + 6 = 15
 7 + 8 = 15
 15 = 15
 *
 */
public class expression_of_numbers {

	public static void main(String[] args) {
		int n = 300;
		int answer = 0;
		for(int i=1; n - ((i*(i-1))/2)>0; i++){ // 등차 수열의 합이 n과 같다면 성공 
            if((n-((i*(i-1))/2))%i==0){
                answer++;
            }
        }
		System.out.println(answer);
		return ; // answer
	}

}
