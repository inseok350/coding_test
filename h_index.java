// H - Index
// https://school.programmers.co.kr/learn/courses/30/lessons/42747

/*
� �����ڰ� ��ǥ�� �� n�� �� h�� �̻� �ο�� ���� h�� �̻��̰� ������ ���� h�� ���� �ο�Ǿ��ٸ� h�� �ִ��� H-Index�� �ȴ�
 */

public class h_index {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5}; // �׽�Ʈ ���̽�
		int answer = 0;
		int count;
		for(int i=1; i<=citations.length; i++){
            count = 0;
            for(int c : citations){
                if(c >= i ) count++;
            }
            if(count >= i) answer = i;
        }
		System.out.println(answer);
        return ;

	}

}
