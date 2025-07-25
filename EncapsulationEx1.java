package day11;

public class EncapsulationEx1 {
	public static void main(String[] args) {
		
		Book bk=new Book();
		bk.setId(1111);
		System.out.println(bk.getId());
		bk.setBookName("Python");
		System.out.println(bk.getBookName());
		bk.setAuthorName("Kalix");
		System.out.println(bk.getAuthorName());
		bk.setLibrarian("Mathew");
		System.out.println(bk.getLibrarian());
		bk.setPrice(450.45f);
		System.out.println(bk.getPrice());
	
}
}
class Book{
	private int id;
	private String bookName;
	private String authorName;
	private String Librarian;
	private float price;
	
	public int getId() {
		return id;
	}
	public void setId(int bookId) {
		id=bookId;
	}
	public String getBookName() {
		return bookName;
		
	}
	public void setBookName(String name) {
		bookName=name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String name) {
		authorName=name;
	}
	public String getLibrarian() {
		return Librarian;
	}
	public void setLibrarian(String LibrarianName) {
		Librarian=LibrarianName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float BookPrice) {
		price=BookPrice;
	}
}
