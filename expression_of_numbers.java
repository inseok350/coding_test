/*
 * ������ ǥ�� -> ���� ����
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 * 
 * 
 15�� ���� �� �� �Ʒ��� ���� ��Ÿ �� �� �ִ� �ڿ��� n�� �־��� �� ���ӵ� �ڿ��� n�� ǥ���ϴ� ����� ���� return
 1 + 2 + 3 + 4 + 5 = 15
 4 + 5 + 6 = 15
 7 + 8 = 15
 15 = 15
 *
 */
public class expression_of_numbers {

	public static void main(String[] args) {
		int n = 300;
		int answer = 0;
		for(int i=1; n - ((i*(i-1))/2)>0; i++){ // ���� ������ ���� n�� ���ٸ� ���� 
            if((n-((i*(i-1))/2))%i==0){
                answer++;
            }
        }
		System.out.println(answer);
		return ; // answer
	}

}
