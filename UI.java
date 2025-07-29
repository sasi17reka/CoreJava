package day12;

public class UI {
	int rollno=1000;
	public static void main(String[] args) {
		
		Student std1 = new Student(111,"Java","Reddy","Riya",240.50);
		Student std2 = new Student(333,"Python","chaitanya","Niharika",560.25);
		
		System.out.println(std1);
		System.out.println(std2);
	}

}

