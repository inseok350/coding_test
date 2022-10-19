//https://school.programmers.co.kr/learn/courses/30/lessons/17680
//Programmers 2018 kakao Blind RECRUITMENT [1차] 캐시

//캐시 크기(cacheSize)와 도시이름 배열(cities)을 입력 받는다
//캐시 크기는 정수이며, 범위는 0~30
//도시 크기는 100,000개 특수문자, 숫자, 공백이 사용되지 않으며 대소문자 구분이 없다
//도시 이름은 최대 20자
//총 실행 시간을 return (출력)한다

//조건 1 : LRU를 통한 캐시 교체 알고리즘 사용 --> 가장 최근에 사용되지 않은 캐시를 교체
//조건 2 : cache hit일 경우 실행시간은 1
//조건 3 : cache miss일 경우 실행시간은 5

//hint : 캐시가 0일 경우 전부 miss로 처리
import java.util.*;



class k_1st_cache {
	
	public static void main(String[] args) {
		int answer = 0;
		int c_size = 3;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		if(c_size == 0){
			answer = cities.length * 5;
         return ;
     }
		LinkedList<String> cache = new LinkedList<>();
		for (int i=0; i<cities.length; i++) {
			if(cache.remove(cities[i].toUpperCase())){
				cache.add(cities[i].toUpperCase());
				answer++;
				continue;
			}else if(cache.size() < c_size) {
				cache.add(cities[i].toUpperCase());
				answer += 5;
				continue;
			}else if(cache.size() >= c_size){
				cache.removeFirst();
				cache.add(cities[i].toUpperCase());
				answer += 5;
				continue;
			}
		}
		System.out.println(answer);
     return ;
 }
}
