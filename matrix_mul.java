// 행렬의 곱
//https://school.programmers.co.kr/learn/courses/30/lessons/12949
// arr1, arr2로 2개의 행렬을 받고 answer로 return한다
public class matrix_mul {

	public static void main(String[] args) {
		//int[][] arr1;
		//int[][] arr2;
		// 테스트 값
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		int[][] answer = new int[arr1.length][arr2[0].length];
		for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                for(int k=0; k < arr1[0].length; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
		System.out.println(answer[0][0]);
		return ;

	}
 
}
