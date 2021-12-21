package Iterator;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {

	private Book[] books;
	private int last = 0;

	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}

	public Book getBook(int idx) {
		return this.books[idx];
	}

	public void appendBook(Book book) {
		this.books[last] = book;
		last ++;
	}

	public int getLength() {
		return last;
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
	
}	
