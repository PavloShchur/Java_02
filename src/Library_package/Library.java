package Library_package;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Library {

	private Map<Author, List<Book>> map = new HashMap<>();
	private Set<Entry<Author, List<Book>>> set = map.entrySet();

	public Set<Entry<Author, List<Book>>> getSet() {
		return set;
	}

	public void setSet(Set<Entry<Author, List<Book>>> set) {
		this.set = set;
	}

	public void add_author() {
		System.out.println("Please enter name of author");
		String name = Main.scanner.next();
		System.out.println("Please enter surname of author");
		String surname = Main.scanner.next();
		int height = 160 + (int) (Math.random() * 40);
		int weight = 60 + (int) (Math.random() * 40);
		int age = 18 + (int) (Math.random() * 50);
		map.put(new Author(height, weight, age, name, surname), new ArrayList<Book>());
	}

	public void add_book_to_author() {
		System.out.println("Please enter name of author");
		String name = Main.scanner.next();
		System.out.println("Please enter surname of author");
		String surname = Main.scanner.next();

		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSurname().equalsIgnoreCase(surname)) {
				System.out.println("Please enter name of book");
				String name_of_book = Main.scanner.next();
				int year_of_publishing = 1000 + (int) (Math.random() * 2000);
				int number_of_pages = 10 + (int) (Math.random() * 5000);
				entry.getValue().add(new Book(name_of_book, year_of_publishing, number_of_pages));
			}
		}
	}

	public void delete_book_from_author() {
		System.out.println("Please enter name of author");
		String name = Main.scanner.next();
		System.out.println("Please enter surname of author");
		String surname = Main.scanner.next();

		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSurname().equalsIgnoreCase(surname)) {
				System.out.println("Please enter name of book");
				String name_of_book = Main.scanner.next();

				Collection<Book> books = entry.getValue();
				Iterator<Book> iterator2 = books.iterator();
				while (iterator2.hasNext()) {
					Book book = iterator2.next();
					if (book.getName_of_book().equalsIgnoreCase(name_of_book)) {
						iterator2.remove();
					}
				}
			}
		}
	}

	public void delete_author() {
		System.out.println("Please enter name of author");
		String name = Main.scanner.next();
		System.out.println("Please enter surname of author");
		String surname = Main.scanner.next();

		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSurname().equalsIgnoreCase(surname)) {
				iterator.remove();
			}
		}
	}

	public void delete_all_books_from_author() {
		System.out.println("Please enter name of author");
		String name = Main.scanner.next();
		System.out.println("Please enter surname of author");
		String surname = Main.scanner.next();

		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSurname().equalsIgnoreCase(surname)) {
				Collection<Book> books = entry.getValue();
				Iterator<Book> iterator2 = books.iterator();
				while (iterator2.hasNext()) {
					books.clear();
				}
			}
		}
	}

	public void sort_by_number_of_pages_big() {
		System.out.println("Please enter name of author");
		String name = Main.scanner.next();
		System.out.println("Please enter surname of author");
		String surname = Main.scanner.next();

		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSurname().equalsIgnoreCase(surname)) {
				List<Book> books = entry.getValue();
				Collections.sort(books, new Sort_by_number_of_pages_big());
			}
		}
	}

	public void sort_by_number_of_pages_smallest() {
		System.out.println("Please enter name of author");
		String name = Main.scanner.next();
		System.out.println("Please enter surname of author");
		String surname = Main.scanner.next();

		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSurname().equalsIgnoreCase(surname)) {
				List<Book> books = entry.getValue();
				Collections.sort(books, new Sort_by_number_of_pages_smallest());
			}
		}
	}

	public void sort_by_year_new() {
		System.out.println("Please enter name of author");
		String name = Main.scanner.next();
		System.out.println("Please enter surname of author");
		String surname = Main.scanner.next();

		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSurname().equalsIgnoreCase(surname)) {
				List<Book> books = entry.getValue();
				Collections.sort(books, new Sort_by_year_new());
			}
		}
	}

	public void sort_by_year_old() {
		System.out.println("Please enter name of author");
		String name = Main.scanner.next();
		System.out.println("Please enter surname of author");
		String surname = Main.scanner.next();

		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSurname().equalsIgnoreCase(surname)) {
				List<Book> books = entry.getValue();
				Collections.sort(books, new Sort_by_year_old());
			}
		}
	}

	public void show_library() {
		set = map.entrySet();
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
