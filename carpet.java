/*
 * ī��
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 * �׵θ��� �����̰� ���� ������ ������� ī���� ������ ������� �־����� �� ī���� ���� ������ ���̸� ��ȯ�϶�
 */
public class carpet {
	
	public static void main(String args[]) {
		
		//test case
		int brown = 10;
		int yellow = 2;
			
		int[] answer = {0,0};
        double y_r = 0;
        int b_r = 0;
        int b_c = 0;
        // int h�� yellow�� ���� ��, ���ΰ� ���κ��� ���ų� �����Ѵ�.
        for (int h=1; h<=yellow; h++){  // ������� ����ؼ� ���� ã�´�
                y_r = (double)yellow/h;
                b_r = (int)y_r + 2;
                b_c = h + 2;
                if(yellow%h != 0 ) {continue;}
                if(b_r*b_c == yellow+brown){
                    answer[1] = b_c;
                    answer[0] = b_r;
                    break;
                }
        }
        
		System.out.println("����: " + answer[0] + " ���� :" + answer[1]);
		return;
	}
}
