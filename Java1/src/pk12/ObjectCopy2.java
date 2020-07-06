package pk12;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조경래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new Book(); //객체 직접 생성
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i=0; i<bookArray1.length; i++) {	
		bookArray2[0].setBookname(bookArray1[0].getBookname());
		bookArray2[0].setAuthor(bookArray1[0].getAuthor());
		}
		for(int i=0; i<bookArray2.length; i++) { //복사된 내용을 확인
			bookArray2[i].showBookinfo();
		}
			bookArray1[0].setBookname("나목"); //bookArray1의 내용 수정
			bookArray1[0].setAuthor("박완서");
			
			System.out.println("====bookArray1====");
			for(int i=0; i<bookArray1.length; i++) {
				bookArray1[i].showBookinfo();
			}
			System.out.println("====bookArray2====");
			for(int i=0; i<bookArray2.length; i++) {
				bookArray2[i].showBookinfo(); //다른 내용으로 출력됨
			}
		}
		

		

}
