package pk6;

public class CarGasExample {

	public static void main(String[] args) {
		CarGas myCarGas = new CarGas();
		
		//CarGas��  setGas()�޼ҵ� ȣ��
		myCarGas.setGas(5);
		//CarGas�� isLeftGas()�޼ҵ� ȣ��
		boolean gasState = myCarGas.isLeftGas();
				if(gasState == true) {
					System.out.println("��پ�~");
					//CarGas�� run() �޼ҵ� ȣ��
					myCarGas.run();
				}
		if(/*CarGas�� isLeftGas()�޼ҵ� ȣ��*///������ �ʿ� ����
			myCarGas.isLeftGas() == true) {
			System.out.println("gas ����");
		}
		else {
			System.out.println("gas �ٴ�");
		
		}
	}

}
