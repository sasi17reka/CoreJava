package day9;

public class Library {
	int id;
	String bookname;
	String authorname;
	double price;
	
	public static void main(String[] args) {
	Library detl = new Library();
	detl.id = 2260;
	detl.bookname = "Java";
	detl.authorname = "Kaushik";
	detl.price = 250.25;
	
	System.out.println("Book ID : "+detl.id);
	System.out.println("Book Name : "+detl.bookname);
	System.out.println("Author Name : "+detl.authorname);
	System.out.println("Book Price : "+detl.price);
	
	Library detl2 = new Library();
	detl2.id = 2270;
	detl2.bookname = "Python";
	detl2.authorname = "Vijaydev";
	detl2.price = 450.35;
	
	System.out.println("Book ID : "+detl2.id);
	System.out.println("Book Name : "+detl2.bookname);
	System.out.println("Author Name : "+detl2.authorname);
	System.out.println("Book Price : "+detl2.price);
		
	}

}
