package chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		//입력후
		while(true) {//"그만"이 입력될 때까지 입력을 반복
			System.out.println("나라 이름, 인구>> ");
			//scanner로 입력받은 것을 변수방에 저장
			String nation = scanner.next();
			//변수방에 그만이라는 문자가 들어오면 break(equals사용)
			if (nation.equals("그만")) 
				break;  // 입력 중지
			//인구를 입력받아 population변수방에 저장 scanner.nextInt();
			int population = scanner.nextInt();
			//nations.put
			nations.put(nation, population);//
		
			
		}
			//인구검색
			while(true) {
				System.out.println("인구 검색할 나라명을 입력하세요>> ");
				//scanner로 입력받음
				String nation = scanner.next();
			
				//변수방에 그만이라는 문자가 들어오면 break(equals사용)
				if (nation.equals("그만")) 
					break;  // 입력 중지
				//nations.get으로 인구 추출해서 변수방에 저장
				Integer n = nations.get(nation);
				if(n == null) 
					System.out.println(nation + "나라가 없음");
				
				else 
					System.out.println(nation + "의 인구는 "+n);				
				}
				scanner.close();
				
			}
			
				}
			
		
		
	


