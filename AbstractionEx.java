package day15;

abstract class Calculator {
		public abstract void add(int a,int b);
		public abstract void sub(int a,int b);
		public abstract void mul(int a,int b);
		public abstract void div(int a,int b);
		public abstract void mod(int a,int b);

		
	}
	public class AbstractionEx extends Calculator{
		@Override
		public void add(int a,int b) {
			System.out.println("Addition: "+(a+b));
		}
		public void sub(int a,int b) {
			System.out.println("Subtraction: "+(a-b));
		}
		public void mul(int a,int b) {
			System.out.println("Multiplication: "+(a*b));
		}
		public void div(int a,int b) {
			System.out.println("Division: "+(a/b));
		}
		public void mod(int a,int b) {
			System.out.println("Modulus: "+(a%b));
		}
		public static void main(String[] args) {
			AbstractionEx calc = new AbstractionEx();
			calc.add(10, 20);
			calc.sub(20, 30);
			calc.mul(5, 5);
			calc.div(20, 2);
			calc.mod(50, 3);
		}
	}


