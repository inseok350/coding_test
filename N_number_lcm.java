/*
 * N���� �ּ� �����
 * https://school.programmers.co.kr/learn/courses/30/lessons/12953
 * 
 * n���� ���� �ּҰ������ ��ȯ
 * 
 * ȿ������ ���
 * �ּ� ����� = N���� ������ �� / �ִ� �����
 * �� ���� �ִ� ������� ���ϴ� ���� ��� - ��Ŭ���� ȣ����
 */
public class N_number_lcm {
	static int gcd(int a, int b){ // ��Ŭ���� ȣ������ ����� �ִ�����
        int temp;
        if( a < b){
            temp = a;
            a = b;
            b = temp;
        }
        while(a % b != 0){ // ū ���� ���� ���� ���� ������ ���� 0�̸� �ִ� �����
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
        answer = arr[0]; // ���ڰ� �ϳ��� ���
        for(int i=1; i<arr.length; i++){
            answer = answer * arr[i] / gcd(answer, arr[i]); 
        }
        return ;

	}

}
