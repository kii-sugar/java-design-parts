
import java.util.Iterator;

import Iterator.Book;
import Iterator.BookShelf;

public class App {
	public static void main(String[] args) throws Exception {
		BookShelf bookShelf = new BookShelf(/*本の最大数*/4);
		bookShelf.appendBook(new Book("リトルマーメイド"));
		bookShelf.appendBook(new Book("Java言語で学ぶデザインパターン入門"));
		bookShelf.appendBook(new Book("Web API The Good Parts"));
		bookShelf.appendBook(new Book("パンダ缶"));

		// 明示的にIteratorを使う方法
		Iterator<Book> it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();

		// 拡張for文を使う方法
		for (Book book : bookShelf) {
			System.out.println(book.getName());
		} 
	}
}
