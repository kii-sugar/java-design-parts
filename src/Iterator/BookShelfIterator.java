package Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
	private BookShelf bookShelf;
	private int idx;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.idx = 0;
	}

	@Override
	public boolean hasNext() {
		if (bookShelf.getLength() > idx) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Book next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		Book book = bookShelf.getBook(idx);
		idx++;
		return book;
	}
}
