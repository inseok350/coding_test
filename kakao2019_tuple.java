/*
kakao 2019 tuple 요약
https://school.programmers.co.kr/learn/courses/30/lessons/64065
중복되는 원소가 없으며, 원소의 순서가 달라도 원소 수의 따른 주요 튜플 원소가 있다며 같은 것으로 취급한다
집합 기호는 "{ }"를 사용하며 문자열로 주어지며 원본 튜플 값을 찾아라

방법
1. 끝부분 중괄호를 먼저 해체한다
2. split를 사용하여 배열로 분리
3. Arrays.sort를 Comparator, compare를 람다식으로 적용하여 문자열 배열의 길이에 따라서 정렬
4. HashSet은 중복을 허용하지 않기때문에 HashSet.add가 된다면 parseInt를 사용하여 정답을 추가한다.
*/

import java.util.*;

class kakao2019_tuple {
	public static void main(String[] args) {
		// test case Strinf s
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		Set<String> set_tuple = new HashSet<>();
        String[] temp_s = s.replaceAll("[{]"," ").replaceAll("[}]"," ").trim().split(" , ");
        Arrays.sort(temp_s, (String s1, String s2) -> {return s1.length()-s2.length();}); // 람다식으로 문자열 배열의 길이에 따라서 정렬
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
