package chapter26;

public class Student {
	//필드(private)
	private String name;
	private String major;
	private String studentId;
	private Double grade;
	//생성자
	public Student(String name, String major, String StudentId, Double grade) {
		this.name=name; this.major=major; this.studentId=studentId; this.grade=grade;
		
	}
	public String getName() {
		return name;
	}
	
	
	public String getMajor() {
		return major;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public Double getGrade() {
		return grade;
	}
	public void find_student(String name) {
		if(name.equals(this.name))
			System.out.println(this.name + ", "+this.major + ", "+this.studentId);
	}
	}


