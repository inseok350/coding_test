/*
JadenCase ���ڿ� �����
https://school.programmers.co.kr/learn/courses/30/lessons/12951

��� �ܾ��� ù ���ڰ� �빮���̰� �������� ���ĺ��� �ҹ����� ���ڿ�
��, ù���ڰ� ���ĺ��� �ƴ� ������ �̾����� ���ĺ��� �ҹ��ڷ� �� ��
*/
public class JadenCase_String {

	public static void main(String[] args) {
		// test case
		String s = "3people unFollowed me";
		String answer = "";
		boolean sw = true;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)) == true) { // ���� ����
                answer += s.charAt(i);
                sw = false;
                continue;
            }
            else if(s.charAt(i) == ' '){ // ������ ���� ù��° �ܾ����� Ȯ��
                answer += s.charAt(i); 
                sw = true;
                continue;
            }
            if(sw == true){ // sw�� ���ؼ� �빮��, �ҹ��� ����
                answer += Character.toUpperCase(s.charAt(i));
                sw = false;
            }else{
                answer += Character.toLowerCase(s.charAt(i));
            }
        }
        // return test
        System.out.println(answer);
        return ;

	}

}
