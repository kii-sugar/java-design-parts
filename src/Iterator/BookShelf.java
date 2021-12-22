package Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {

	private List<Book> books;
	private int last = 0;

	public BookShelf() {
		this.books = new ArrayList<>();
	}

	public Book getBook(int idx) {
		return this.books.get(idx);
	}

	public void appendBook(Book book) {
		this.books.add(book);
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
