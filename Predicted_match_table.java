/*
 * 예상 대진표
 * N명의 참가하고 2^x의 형태로 대진표가 만들어 질 때 A와 B가 만나게 되는 라운드를 반환하라
 * 
 * 여러가지 방법이 있으나 효율을 위하여 이진법과 피라미드 구조로 같이 매치하는 인원을 한 팀으로 구별해서 단계별로 찾는 방법이 있다
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
