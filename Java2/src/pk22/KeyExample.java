package pk22;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//key��ü�� �ĺ�Ű�� �Ͽ� String���� �����ϴ� HashMap��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//hashmap(int key, String name){
		//�ĺ�Ű(hashcode)�� put���� �Է�
		hashMap.put(new Key(1), "ȫ�浿");
		hashMap.put(new Key(2), "����Ʈ����");
		hashMap.put(new Key(3), "100");
		hashMap.put(new Key(4), "3.9");
		
		//�ĺ�Ű(hashcode)�� �̟G�Ͽ� ��(String)�� �о��
		String value = hashMap.get(new Key(3));
		System.out.println(value);
		

		

	}

}
