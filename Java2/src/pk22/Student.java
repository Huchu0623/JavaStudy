package pk22;

public class Student {
	
	int studentId;
	String studentName;
	
	Student(int studentId, String studentName){
		this.studentId = studentId; this.studentName= studentName;
	}
	

	@Override
	public String toString() {
		
		return studentId + "," + studentName;
		
	}	
	@Override //��
	public int hashCode() {
		return studentId;
	}
	@Override //����
	public boolean equals(Object obj) {
	//instanceof :�����ڷν� ��üŸ�� ����ȯ�� ���������� ���θ� �Ǵ�
		if(obj instanceof Student) {
			//downĳ���� :�θ�Ŭ���� ��ü�� �ڽ�Ŭ���� ��ü�� ����ȯ
			Student std = (Student)obj;
			if(studentId == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	
	}
	}


	
