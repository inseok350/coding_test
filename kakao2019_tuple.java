/*
kakao 2019 tuple ���
https://school.programmers.co.kr/learn/courses/30/lessons/64065
�ߺ��Ǵ� ���Ұ� ������, ������ ������ �޶� ���� ���� ���� �ֿ� Ʃ�� ���Ұ� �ִٸ� ���� ������ ����Ѵ�
���� ��ȣ�� "{ }"�� ����ϸ� ���ڿ��� �־����� ���� Ʃ�� ���� ã�ƶ�

���
1. ���κ� �߰�ȣ�� ���� ��ü�Ѵ�
2. split�� ����Ͽ� �迭�� �и�
3. Arrays.sort�� Comparator, compare�� ���ٽ����� �����Ͽ� ���ڿ� �迭�� ���̿� ���� ����
4. HashSet�� �ߺ��� ������� �ʱ⶧���� HashSet.add�� �ȴٸ� parseInt�� ����Ͽ� ������ �߰��Ѵ�.
*/

import java.util.*;

class kakao2019_tuple {
	public static void main(String[] args) {
		// test case Strinf s
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		Set<String> set_tuple = new HashSet<>();
        String[] temp_s = s.replaceAll("[{]"," ").replaceAll("[}]"," ").trim().split(" , ");
        Arrays.sort(temp_s, (String s1, String s2) -> {return s1.length()-s2.length();}); // ���ٽ����� ���ڿ� �迭�� ���̿� ���� ����
        int[] answer = new int[temp_s.length];
        int index = 0;
        for(String t_s : temp_s){
            for (String num : t_s.split(",")){
                if(set_tuple.add(num)) answer[index++] = Integer.parseInt(num);
            }
        }
        return ;
    }
}
