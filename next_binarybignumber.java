/*
 * ���� ū ����
 * https://school.programmers.co.kr/learn/courses/30/lessons/12911
 * 
 * ���� 1. n�� ���� ū ���ڴ� n���� ū �ڿ��� �Դϴ�.
 * ���� 2. n�� ���� ū ���ڿ� n�� 2������ ��ȯ���� �� 1�� ������ �����ϴ�.
 * ���� 3. n�� ���� ū ���ڴ� ���� 1, 2�� �����ϴ� �� �� ���� ���� �� �Դϴ�.
 * 
 * */
public class next_binarybignumber {
	
	public static int binary_string_num_check(String s){ // ���ڿ��� �̷���� �������� 1�� ������ ��ȯ
        int one_num = 0; // 1�� ����
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1') {one_num++;}
        }
        return one_num;
    }
    public static int binary_equal_num_seach(int n){ // ���� ���� ���� �ڿ����� ���Ͽ� 1�� ������ ���� �ڿ����� ��ȯ
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
