/* 
 * �Ǻ���ġ �� + ������
 * https://school.programmers.co.kr/learn/courses/30/lessons/12945
 * 2 �̻��� int input_n��° ���� 1234567���� ���� �������� �����ϴ� �Լ�
 * 
 * �����÷ο� ���� : ��ⷯ ������ ���� (A + B) % C = ((A % C) + (B % C)) % C
 * 
 */
public class Fibonacci_number {
	
	public static int f_such(int n){
        int f1 = 1;
        int f2 = 1;
        int f_temp = 1;
        
        for (int i=2; i<n; i++){
            f_temp = f1 + f2;
            f1 = f2 % 1234567;
            f2 = f_temp % 1234567;
        }
        return f_temp;
    }

	public static void main(String[] args) {
		// test case
		int input_n = 10;
		int answer = 1;
        answer = f_such(input_n) % 1234567;
        System.out.println(answer);
        return ;
			

	}

}
