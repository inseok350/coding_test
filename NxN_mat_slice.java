/*
n^2 배열 자르기
https://school.programmers.co.kr/learn/courses/30/lessons/87390
정식 방법
1. n*n의 2차원 배열 생성
2. i = 1~n -> 1행1열부터 i행 i열까지 영역 내의 모든 빈칸을 숫자 i로 채운다
3. 1~n행을 잘라내어 1차원 배열로 만든다
4. 1차원 배열을 arr이라 할 때 arr[left~right]를 뽑아낸다
효율적인 방법
정식적인 arr의 index 값을 유추하여 행과 열을 계산하고 행과 열 중 높은 값에 +1 하여 모으고 return 

중요한 점!!! 메모리와 시간복잡도를 고려 안하면 쉬운 문제일수 있지만 데이터 값이 커질수록 용량이 비대해지는 문제가 있다
*/

public class NxN_mat_slice {

	public static void main(String[] args) {
		// 테스트 값 n, left, right
		int n = 3;
		long left = 2;
		long right = 5;
		
		int[] answer = new int[(int)right-(int)left+1];
        int index = 0;
        int row;
        int col;
        for(long i = left ; i <= right; i++){ // i / n을 하여 배열의 구역을 찾을 수 있다
            row = (int)(i / n);
            col = (int)(i % n);
            answer[index++] = Math.max(row,col)+1;
        }
        return ; // answer
	}
}
