package day13;

public class student {
	
		private int id;
		private String name;
		private int rollNo;
		private double fees;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public double getFees() {
			return fees;
		}
		public void setFees(double fees) {
			this.fees = fees;
		}
		public student() {
			
		}
		public student(int id, String name, int rollNo, double fees) {
			
			this.id = id;
			this.name = name;
			this.rollNo = rollNo;
			this.fees = fees;
		}
		@Override
		public String toString() {
			return "Student id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", fees=" + fees ;
		}
	}

