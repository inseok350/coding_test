/*
 * ���� ��ȯ �ݺ��ϱ�
 * https://school.programmers.co.kr/learn/courses/30/lessons/70129
 * 0�� 1�� �̷���� � ���ڿ� x�� ���� ���� ��ȯ�� ������ ���� ����
 * 1. x�� ��� 0�� ����
 * 2. x�� ���̸� c��� �ϸ�, "C�� 2�������� ǥ���� ���ڿ�"�� �ٲ۴�
 * ���� ��ȯ Ƚ���� ���ŵ� ��� 0�� ������ ���� �迭�� ��� return
*/

public class Repeat_Binary_Transformation {

	public static void main(String[] args) {
		//test case ��
		String s = "110010101001";
		
		int[] answer = {0,0};
        int one_count;
        while(s.length() > 1){
            one_count = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0') {answer[1]++;}
                else {one_count++;}
            }
            s = Integer.toBinaryString(one_count);
            answer[0]++;
        }
        for (int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        return; //answer

	}

}
