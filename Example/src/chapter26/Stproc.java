package chapter26;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Stproc {

	public static void main(String[] args) {
		Student[] student = new Student[4];//fixed
		ArrayList<Student> manage = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ���� ����� �Է��ϼ���.");
		for(int i=0; i<student.length; i++) {
			System.out.println(">>");
		//
		//manage.add(student[i]);
			//�Է�
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text,",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String studentId = st.nextToken().trim();
			Double grade = Double.parseDouble(st.nextToken().trim());
			
			student[i] = new Student(name, major, studentId, grade);
			manage.add(student[i]);
		}
			
			//ficed-length �ް�
			//ArratList
			System.out.println(manage);
	}
	

}
