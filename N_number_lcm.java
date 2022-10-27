/*
 * N개의 최소 공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12953
 * 
 * n개의 수의 최소공배수를 반환
 * 
 * 효율적인 방법
 * 최소 공배수 = N개의 수들의 곱 / 최대 공약수
 * 두 수의 최대 공약수를 구하는 쉬운 방법 - 유클리드 호제법
 */
public class N_number_lcm {
	static int gcd(int a, int b){ // 유클리드 호제법을 사용한 최대공약수
        int temp;
        if( a < b){
            temp = a;
            a = b;
            b = temp;
        }
        while(a % b != 0){ // 큰 수를 작은 수로 나눈 나머지 값이 0이면 최대 공약수
            temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
	public static void main(String[] args) {
		
		//test case
		int[] arr = {2,6,8,14};
		
		int answer = 0;
        answer = arr[0]; // 숫자가 하나일 경우
        for(int i=1; i<arr.length; i++){
            answer = answer * arr[i] / gcd(answer, arr[i]); 
        }
        return ;

	}

}
