/*
n^2 �迭 �ڸ���
https://school.programmers.co.kr/learn/courses/30/lessons/87390
���� ���
1. n*n�� 2���� �迭 ����
2. i = 1~n -> 1��1������ i�� i������ ���� ���� ��� ��ĭ�� ���� i�� ä���
3. 1~n���� �߶󳻾� 1���� �迭�� �����
4. 1���� �迭�� arr�̶� �� �� arr[left~right]�� �̾Ƴ���
ȿ������ ���
�������� arr�� index ���� �����Ͽ� ��� ���� ����ϰ� ��� �� �� ���� ���� +1 �Ͽ� ������ return 

�߿��� ��!!! �޸𸮿� �ð����⵵�� ��� ���ϸ� ���� �����ϼ� ������ ������ ���� Ŀ������ �뷮�� ��������� ������ �ִ�
*/

public class NxN_mat_slice {

	public static void main(String[] args) {
		// �׽�Ʈ �� n, left, right
		int n = 3;
		long left = 2;
		long right = 5;
		
		int[] answer = new int[(int)right-(int)left+1];
        int index = 0;
        int row;
        int col;
        for(long i = left ; i <= right; i++){ // i / n�� �Ͽ� �迭�� ������ ã�� �� �ִ�
            row = (int)(i / n);
            col = (int)(i % n);
            answer[index++] = Math.max(row,col)+1;
        }
        return ; // answer
	}
}
