package pk29.staticex;


class Outter2{
	//필드
	int outNum = 100;
	static int sNum = 200;
	//메소드
	Runnable getRunnable(int i) {//매개변수도 final로 처리되어 다른 클래스에서 사용x
		int num = 100;//지역변수이자 상수화 final
		int localnum =10;
		//익명의 클래스
			return new Runnable() {
			@Override
			public void run() {
				//num=200;	
				//i=20;
				System.out.println("localNum : " + localnum + " 내부클래스의 인스턴스 변수");
				System.out.println("outNum : " + outNum + " 외부클래스의 인스턴스 변수");
				System.out.println("Outter-static : " + sNum + " 외부클래스의 정적변수");
			}	
		};	
	}
	/*내부에서 작동중인 객체
	Runnable runner = new Runnable(){

}*/
}
public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		Outter2 out = new Outter2();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}
