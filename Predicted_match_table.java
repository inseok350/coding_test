/*
 * ���� ����ǥ
 * N���� �����ϰ� 2^x�� ���·� ����ǥ�� ����� �� �� A�� B�� ������ �Ǵ� ���带 ��ȯ�϶�
 * 
 * �������� ����� ������ ȿ���� ���Ͽ� �������� �Ƕ�̵� ������ ���� ��ġ�ϴ� �ο��� �� ������ �����ؼ� �ܰ躰�� ã�� ����� �ִ�
 */
public class Predicted_match_table {

	public static void main(String[] args) {
		
		//test case
		int n = 8;
		int a = 4;
		int b = 7;
		
		int answer = 0;
        
        while (a != b){
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }
        System.out.println(answer);
        return ; // answer

	}

}
