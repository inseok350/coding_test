/*
 * 다음 큰 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12911
 * 
 * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
 * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
 * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
 * 
 * */
public class next_binarybignumber {
	
	public static int binary_string_num_check(String s){ // 문자열로 이루어진 이진수의 1의 개수를 반환
        int one_num = 0; // 1의 개수
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1') {one_num++;}
        }
        return one_num;
    }
    public static int binary_equal_num_seach(int n){ // 인자 값과 다음 자연수를 비교하여 1의 개수가 같은 자연수를 반환
        int next_num = n + 1;
        String n_s;
        String nn_s;
        for(int i=n; i < 1000000; i++){
            n_s = Integer.toBinaryString(n);
            nn_s = Integer.toBinaryString(next_num);
            if(binary_string_num_check(n_s) == binary_string_num_check(nn_s)){
                break;
            }
            next_num++;
        }
        return next_num;
    }
    
    public static void main(String args[]) {
    	//test case
    	int n = 78;
        int answer = 0;
        answer = binary_equal_num_seach(n);
        System.out.println(answer);
        return ;
    }
	
}
