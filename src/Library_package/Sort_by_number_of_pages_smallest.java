package Library_package;

import java.util.Comparator;
import java.util.List;

public class Sort_by_number_of_pages_smallest implements Comparator<Book> {

	public int compare(Book o1, Book o2) {
		return o1.getNumber_of_pages() - o2.getNumber_of_pages();
	}

}
