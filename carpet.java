/*
 * 카펫
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 * 테두리가 갈색이고 안의 색깔이 노란색인 카펫을 갈색과 노란색이 주어졌을 때 카펫의 가로 세로의 길이를 반환하라
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
        // int h는 yellow의 높이 단, 가로가 세로보다 같거나 길어야한다.
        for (int h=1; h<=yellow; h++){  // 관계식을 사용해서 값을 찾는다
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
        
		System.out.println("가로: " + answer[0] + " 세로 :" + answer[1]);
		return;
	}
}
