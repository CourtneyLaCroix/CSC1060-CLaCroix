
public class Book {
	private String title;
	private String author;
	private boolean availabilty;
	private int isbn;
	
	public Book(String title, String author, boolean availabilty, int isbn) {
		this.title = title;
		this.author = author;
		this.availabilty = availabilty;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isAvailabilty() {
		return availabilty;
	}

	public void setAvailabilty(boolean availabilty) {
		this.availabilty = availabilty;
	}

	public int getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", availabilty=" + availabilty + ", isbn=" + isbn + "]";
	}
	
	
}
