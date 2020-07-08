package pk29.staticex;



class OutClass{
	//필드(인스턴트 변수 == 멤버변수==속성)
	private static int num = 10;
	private static int sNum = 20;
	private InClass inClass;//내부 클래스를 변수 처럼 활용하기 위한 선언
	
	//construct(생성자)를 통해서 내부 클래스 객체 생성
	public OutClass() {
		System.out.println("OutClass의 객체가 생성되었습니다.");
		inClass = new InClass(); //내부 클래스 생성		
	}
	
	class InClass{
		
	
		
		//내부 클래스인 필드
		int inNum = 100;
		/*외부에 인스턴스 변수를 선언되어 있는 static을 변경없이 사용하는 건 가능하지만
		 * 기준이 되고 변경없이 사용해야 하는 static타입의 변수를 다른 곳에서 재정의 할 수 없다.*/
		//static int sNum=300;
		//static int sInNum = 200;
		//static void sTest(){}
		
		
		//메소드
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
			System.out.println("OutClass inNum = " + inNum + "(내부 클래스의 인스턴트 변수)");
		}
		
		
	}
	static class InStaticClass{
		//필드
		int inNum = 100;
		static int sInNum = 200;
		void inTest() {
			//num += 10;//외부의 인스턴스
			System.out.println("InStaticClass inNum = " + inNum + "(내부클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 static 변수 사용)");
			System.out.println("InStaticClass sNum = " + sNum + "(외부 클래스의 static 변수 사용)");
		
		}
		static void sTest() {
			//num+=10;
			//inNum +=10;
			sNum=30;
			System.out.println(sNum);
			System.out.println(sInNum);
			
		
		}
	}
}






public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println();
		
		//외부클래스를 이용하여 내부 클래스 생성
		OutClass.InClass inClass = outClass.new InClass();
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.inTest();
		System.out.println();
		//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메소드 호출");
		sInClass.inTest();
		System.out.println();System.out.println("정적 내부 클래스의 static 메소드 호출");
		
		//객체에서 호출
		sInClass.sTest();
		//클래스에서 호출
		System.out.println("정적 내부 클래스의 static메소드 호출2");
		OutClass.InStaticClass.sTest();
		
		
	
		
	}

}
