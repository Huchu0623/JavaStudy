package pk29.staticex;

public class Student {
	//�ν���Ʈ ����
	public static int serialNum = 1000; //������ ������ ������ ����
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
		
	}
	
	public String getStrudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	//static �޼ҵ�
	public static int getSerialNum() {
		int i;//=10;//��������(stack�޸�): �޼ҵ尡 ������ ������
	//studentName = "aaa";(heap)
	//serialNum++;;	//(Data)
		return serialNum;
	}
	public static void serSrialNum(int serialNum) {
		Student.serialNum =serialNum; 
	}
}
