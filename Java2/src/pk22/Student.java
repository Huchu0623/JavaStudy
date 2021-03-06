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
	@Override //논리
	public int hashCode() {
		return studentId;
	}
	@Override //물리
	public boolean equals(Object obj) {
	//instanceof :연산자로써 객체타입 형변환이 가능한지의 여부를 판단
		if(obj instanceof Student) {
			//down캐스팅 :부모클래스 객체가 자식클래스 객체로 형변환
			Student std = (Student)obj;
			if(studentId == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	
	}
	}


	
