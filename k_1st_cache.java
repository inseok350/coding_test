//https://school.programmers.co.kr/learn/courses/30/lessons/17680
//Programmers 2018 kakao Blind RECRUITMENT [1��] ĳ��

//ĳ�� ũ��(cacheSize)�� �����̸� �迭(cities)�� �Է� �޴´�
//ĳ�� ũ��� �����̸�, ������ 0~30
//���� ũ��� 100,000�� Ư������, ����, ������ ������ ������ ��ҹ��� ������ ����
//���� �̸��� �ִ� 20��
//�� ���� �ð��� return (���)�Ѵ�

//���� 1 : LRU�� ���� ĳ�� ��ü �˰��� ��� --> ���� �ֱٿ� ������ ���� ĳ�ø� ��ü
//���� 2 : cache hit�� ��� ����ð��� 1
//���� 3 : cache miss�� ��� ����ð��� 5

//hint : ĳ�ð� 0�� ��� ���� miss�� ó��
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
