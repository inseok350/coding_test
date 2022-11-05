// ��ȣ ȸ���ϱ�
// https://school.programmers.co.kr/learn/courses/30/lessons/76502
// ��ȣ ���ڿ��� �ִ� ���ڿ��� ���̸̹����� �̵��Ͽ� ��ȣ�� �ùٸ��� ����� Ƚ���� ���� ���α׷�
// 1. 0 ~ s.length-1���� ȸ���ϴ� �ݺ���
// 2. Stack�� ���Ͽ� �ùٸ��� Ȯ���ϰ� ī��Ʈ
// �߰� ���ڿ��� ���̰� Ȧ���ϰ�� �ùٸ��� �ʴ� ���ڿ��� ó���� ��
import java.util.Stack;

public class bracket_Rotation_check {

	public static void main(String[] args) {
		int answer = 0;
		String s = "[](){}"; // �׽�Ʈ ���̽�
        if(s.length() % 2 == 1){ // ���ڿ��� Ȧ���� ���հ�
            return ;
        }
        String temp_s = s;
        char temp_c;
        int count;
        Stack<Character> bracket_stack = new Stack<>();
        for(int i=0; i<temp_s.length()-1; i++){ // ���ڿ��� ȸ��
            count = 0;
            for(int j=0; j<temp_s.length()-1; j++){ // ���ڿ��� �ùٸ��� üũ
                temp_c = temp_s.charAt(j);
                if(temp_c == '[' || temp_c == '(' || temp_c == '{' ) { // ��ȣ�� ������ ������ push
                    bracket_stack.push(temp_c); count++; continue;}
                else if(bracket_stack.empty()) {break;} // stack�� ������� �� ��ȣ�� �����ٸ� �ùٸ��� ���� ���ڿ��̱� ������ Ż��
                // ���ڿ��� ���� �� stack�� ���� ���� �ִ� peek ���� ¦�� �´��� Ȯ��
                else if (temp_c == ']' && bracket_stack.peek() == '[') {
                    bracket_stack.pop(); count++; continue;}
                else if (temp_c == '}' && bracket_stack.peek() == '{') {
                    bracket_stack.pop(); count++; continue;}
                else if (temp_c == ')' && bracket_stack.peek() == '(') {
                    bracket_stack.pop(); count++; continue;}
                break; // ������� ����ȴٸ� ��ȣ�� �������� ��ġ���� peek���� ��ġ���� �ʱ⶧���� �ùٸ��� ���� ���ڿ��� �Ǵ�
            }
            if(count == temp_s.length()-1) {answer++;} // ���� �ݺ������� ������ ¦�� �¾Ҵٸ� �ùٸ� ���ڿ� count�� �ø���
            bracket_stack.clear(); // stack �ʱ�ȭ
            temp_s = temp_s.substring(1) + temp_s.charAt(0);  
        }
        System.out.println(answer);
        return ; // answer ���� return

	}

}
