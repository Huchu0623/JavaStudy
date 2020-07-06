package pk6;

public class CalculatorExample {

	public static void main(String[] args) {
	Calculator myCalc = new Calculator();
	//»ý¼ºÀÚ
	myCalc.powerOn();
	
	int result1 = myCalc.plus(5, 6);
	  	System.out.println("x + y =" + result1);
	  byte x = 10;
	  byte y = 4;
	  double result2 = myCalc.divide(x, y);
	  	System.out.println("x / y =" + result2);
	 
	}

}

	/*System.out.println();
	System.out.println("x + y =");
	System.out.println(myCalc.plus(4, 7));
	System.out.println("x / y =");
	System.out.println(myCalc.divide(10, 5));
	
	System.out.println();
	myCalc.powerOff();
	System.out.println();*/
	
	