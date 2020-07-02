package pk24;

public class GenericPrinterTest {

	public static void main(String[] args) {
		/*T타입의 객체는 모든 클래스에서 상속이 가능하여 자동으로 크래스로 형변환이 가능함*/
		GenericPrinter<Powder> powderPrint = new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());
		Powder powder = powderPrint.getMaterial(); //형변환 하지 않음
		System.out.println(powderPrint);
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticPrint = new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());;
		Plastic plastic = plasticPrint.getMaterial();
		System.out.println(plasticPrint);
		System.out.println(plastic);
		
		/*GenericPrinter<Water> waterPrint = new GenericPrinter<Water>();
		waterPrint.setMaterial(new Water());;
		Water water = waterPrint.getMaterial();
		System.out.println(waterPrint);
		System.out.println(water);*/
		
	}

}
