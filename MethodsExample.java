package day10;


public class MethodsExample {
	
	int id;
	String name;
	long phoneno;
	
	public void display() {
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student phone no : "+phoneno);
	}
	public static void main(String[]args) {
		
		MethodsExample meth1 = new MethodsExample();
		meth1.id = 22;
	    meth1.name = "Lakshman";
	    meth1.phoneno = 123456;
	    meth1.display();
	    
	    MethodsExample meth2 = new MethodsExample();
	    meth2.id = 23;
	    meth2.name = "Sethupathi";
	    meth2.phoneno = 223456;
	    meth2.display();
	    
	   
	    
	}
	
}
