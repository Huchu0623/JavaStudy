package pk6;

public class CarGas {
	//�ʵ�
	int gas;
	//������
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		//gas�� 0�̸� gas�� �����ϴ�.-->false|
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;			
		}
		else {
			System.out.println("gas�� ����մϴ�.");
			return true;
		}
	}	
		void run() {
			//gas�� 0���� ũ�� �޸��ϴ�. gas������|
			while(true) {
				if(gas>1) {
					System.out.println("�޸���.");
					gas -=1;
					System.out.println("gas�ܿ��� : " + gas+ ")");
				}
				else {
					System.out.println("�����.");
					gas -=1;
					System.out.println("gas�ܿ��� : " + gas+ ")");
					return;
		}
	
			}
			}
	
}
