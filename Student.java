package day12;

public class Student {
	private int id;
	private String bookName;
	private String authorname;
	private String stdname;
	private double price;

	public Student() {
	
}
	public Student(int id,String bookName,String authorname,String stdname,double price) {
		
		this.id=id;
		this.bookName=bookName;
		this.authorname=authorname;
		this.stdname=stdname;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString(){
		return id+bookName+authorname+stdname+price;
	}
	}
	

