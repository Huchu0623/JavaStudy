package pk6;

public class CarGasExample {

	public static void main(String[] args) {
		CarGas myCarGas = new CarGas();
		
		//CarGas의  setGas()메소드 호출
		myCarGas.setGas(5);
		//CarGas의 isLeftGas()메소드 호출
		boolean gasState = myCarGas.isLeftGas();
				if(gasState == true) {
					System.out.println("출바알~");
					//CarGas의 run() 메소드 호출
					myCarGas.run();
				}
		if(/*CarGas의 isLeftGas()메소드 호출*///주유의 필요 유뮤
			myCarGas.isLeftGas() == true) {
			System.out.println("gas 남음");
		}
		else {
			System.out.println("gas 바닥");
		
		}
	}

}
