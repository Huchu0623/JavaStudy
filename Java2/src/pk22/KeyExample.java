package pk22;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//key객체를 식별키로 하여 String값을 저장하는 HashMap객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//hashmap(int key, String name){
		//식별키(hashcode)에 put으로 입력
		hashMap.put(new Key(1), "홍길동");
		hashMap.put(new Key(2), "소프트웨어");
		hashMap.put(new Key(3), "100");
		hashMap.put(new Key(4), "3.9");
		
		//식별키(hashcode)를 이욯하여 값(String)을 읽어옴
		String value = hashMap.get(new Key(3));
		System.out.println(value);
		

		

	}

}
