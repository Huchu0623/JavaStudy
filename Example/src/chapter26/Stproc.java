package chapter26;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Stproc {

	public static void main(String[] args) {
		Student[] student = new Student[4];//fixed
		ArrayList<Student> manage = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
		for(int i=0; i<student.length; i++) {
			System.out.println(">>");
		//
		//manage.add(student[i]);
			//입력
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text,",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String number = st.nextToken().trim();
			Double grade = Double.parseDouble(st.nextToken().trim());
			//ficed-length 받고
			student[i] = new Student(name, major, number, grade);
			//Array(student)-->ArrayList(manage)
			manage.add(student[i]);
		}
			//=========================출력========================================
			for(int i=0; i<manage.size(); i++) {
			System.out.println("--------------------------------------------");
			Student s = manage.get(i);
			System.out.println("이름 : "+s.getName());
			System.out.println("학과 : "+s.getMajor());
			System.out.println("학번 : "+s.getnumber());
			System.out.println("학점평균"+s.getgrade());
			}
			System.out.println("--------------------------");
			while(true) {
				System.out.println("학생 이름>> ");
				String name = sc.next();
				if(name.equals("그만"))
					break;
				for(int i = 0; i<manage.size(); i++) {
					Student s=manage.get(i);
					s.find_student(name);
				}
			}
			
		}
			
			
			//ArratList
		
	
	

}
