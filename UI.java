package day13;
import java.util.Scanner;
public class UI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student std = new student();
		//1 for create a New Student
		//2 for show Student
		//3 for modify a Student
		
		boolean isWork = true;
		
		while(isWork) {
			System.out.println("\nEnter any Choice : ");
			System.out.println("1 for create a New Student");
			System.out.println("2 for show Student");
			System.out.println("3 for modify a Student");
			System.out.println("0 for Exit");
			int key = sc.nextInt();
			
			
			if(key == 1) {
				System.out.println("Enter the Std id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Student Name ");
				String name = sc.nextLine();
				System.out.println("Enter the Roll No ");
				int rollNo = sc.nextInt();
				System.out.println("Enter the Student Fees");
				double fees = sc.nextDouble();
				
				std = new student(id,name,rollNo,fees);
					
			}else if(key ==2) {
				System.out.println(std);
			}else if(key == 3) {
				boolean istrue = true;
				while(istrue) {
					System.out.println("Enter any Choice : ");
					System.out.println("1 to modify id");
					System.out.println("2 to modify name");
					System.out.println("3 to modify fees");
					System.out.println("0 for Exit");
					int value = sc.nextInt();
					switch(value) {
					case 1:{
						System.out.println("Enter the modified id :");
						int a=sc.nextInt();
						
						std.setId(a);
						break;
					}case 2:{
						System.out.println("Enter the modified name :");
						sc.nextLine();
						String b=sc.nextLine();
						std.setName(b);
						break;
					}case 3:{
						System.out.println("Enter the modified fees :");
						int c = sc.nextInt();
						std.setFees(c);
						break;
					}case 0:{
						System.out.println("end");
						istrue= false;
						break;
					}default :{
						System.out.println("Enter the correct choice!");
					}
					}					
					
				}
				
			}else if(key == 0) {
				System.out.println("End of program Thank You!");
				isWork = false;
			}
}
	}
}
	

