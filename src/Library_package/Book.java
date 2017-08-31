package Library_package;

public class Book {
	private String name_of_book;
	private int year_of_publishing;
	private int number_of_pages;
	
	

	public Book(String name_of_book, int year_of_publishing, int number_of_pages) {
		super();
		this.name_of_book = name_of_book;
		this.year_of_publishing = year_of_publishing;
		this.number_of_pages = number_of_pages;
	}



	public String getName_of_book() {
		return name_of_book;
	}



	public void setName_of_book(String name_of_book) {
		this.name_of_book = name_of_book;
	}



	public int getYear_of_publishing() {
		return year_of_publishing;
	}



	public void setYear_of_publishing(int year_of_publishing) {
		this.year_of_publishing = year_of_publishing;
	}



	public int getNumber_of_pages() {
		return number_of_pages;
	}



	public void setNumber_of_pages(int number_of_pages) {
		this.number_of_pages = number_of_pages;
	}



	@Override
	public String toString() {
		return "Book [name_of_book=" + name_of_book + ", year_of_publishing=" + year_of_publishing
				+ ", number_of_pages=" + number_of_pages + "]";
	}

	
	
	
}
