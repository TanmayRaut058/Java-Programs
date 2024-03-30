import java.util.*;

public class Book{

	public String bookTitle;
	public String authorName;
	public long ISBN;
	static ArrayList<Book> collection = new ArrayList<>();
	
	public Book(String bookTitle , String authorName, long ISBN){
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.ISBN = ISBN;
	}
	
	public String getTitle(){
		return bookTitle;
	}
	
	public String getAuthor(){
		return authorName;
	}
	
	public long getISBN(){
		return ISBN;
	}
	
	public void addBook(Book book){
		collection.add(book);
	}

	public void removeBook(Book book){
		collection.remove(book);
	}	
	
	public static void main(String[] args){
		Book b1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", 978013110);
    		Book b2 = new Book("An Introduction to Python", "Guido van Rossum", 9355423);
    		
    		b1.addBook(b1);
    		b1.addBook(b2);
    		
    		for(Book b : collection){
    			System.out.println(b.getTitle() + " " + b.getAuthor() + " " + b.getISBN());
    		}
	}
}
