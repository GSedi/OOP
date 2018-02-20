import java.io.Serializable;
import java.util.*;
import java.io.Serializable;
public class Textbook  implements Serializable{
	private int isbn;
	private String title;
	private String authors;
	
	public Textbook() {
		this.isbn = 0;
		this.title = "unknown";
		this.authors = "unknown";
	}
	
	public Textbook(int isbn, String title, String authors) {
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public int getIsbn() {return this.isbn;}
	
	public void setTitle(String title) {this.title = title;}
	public String getTitle() {return this.title;}
	
	public void setAuthors(String authors) {this.authors = authors;}
	public String getAuthors() {return this.authors;}
	
	public boolean equals(Object other) {
		if(other == null) return false;
		if(this == other) return true;
		if(!(other instanceof Textbook)) return false;
		Textbook book = (Textbook)other;
		
		if(this.isbn == book.isbn && this.title.equals(book.title) && this.authors.equals(book.authors)) return true;
		else return false;
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		Textbook book = new Textbook();
		book.isbn = this.isbn;
		book.title = this.title;
		book .authors = this.authors;
		return book;
		
	}
	
	
	public String toString() {
		return "\nTextbook{\nisbn: " + this.isbn + "\nTitle: " + this.title + "\nAuthors: " + this.authors + "\n}"; 
	}
}	
