package pk22;

public class Key {
	
	private static final String Key = null;
	public int number;
	
	public Key(int number) {
		this.number = number;	
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		//�θ�ü�� �ڽİ�ü�� �����Ǿ ����ȯ�� �������� �Ǵ�
		if(obj instanceof Key) {
			//�ٿ�ĳ�������� obj�� KeyŬ������ comparekey�� ����
			Key compareKey = (Key) obj;
			//this�� number�� comparekey�� number ���� ������ true �ƴϸ� false
			
		if(this.number == compareKey.number)	
			return true;
	
		}
		return false;
	}
	

}
