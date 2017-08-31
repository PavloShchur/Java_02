package Library_package;

import java.util.Comparator;
import java.util.List;

public class Sort_by_year_new implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getYear_of_publishing() - o2.getYear_of_publishing();
	}

}
