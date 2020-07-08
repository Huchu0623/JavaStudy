package chapter26;

public class Student2 {
	//필드(private)
	private String name;
	private String major;
	private String number;
	private Double grade;
	//생성자
	public Student2(String name, String major, String number, Double grade) {
		this.name=name; this.major=major; this.number=number; this.grade=grade;
		
	}
	public String getName() {
		return name;
	}
	
	
	public String getMajor() {
		return major;
	}
	
	public String getnumber() {
		return number;
	}
	
	public Double getgrade() {
		return grade;
	}
	public void find_student(String name) {
		if(name.equals(this.name))
			System.out.println(this.name + ", "+this.major + ", "+this.number);
	}
	}


