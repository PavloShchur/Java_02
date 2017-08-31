package Library_package;

import java.util.Scanner;

import Library_package.Library;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Library library = new Library();
		boolean work = true;

		while (work) {
			Menu menu = new Menu();
			menu.menu();
			String choice = Main.scanner.next();
			switch (choice) {
			case "1": {
				library.add_author();
				break;
			}
			case "2": {
				library.add_book_to_author();
				break;
			}
			case "3": {
				library.delete_book_from_author();
				break;
			}
			case "4": {
				library.add_author();
				break;
			}
			case "5": {
				library.delete_all_books_from_author();
				break;
			}
			case "6": {
				library.sort_by_number_of_pages_big();
				break;
			}
			case "7": {
				library.sort_by_number_of_pages_smallest();
				break;
			}
			case "8": {
				library.sort_by_year_old();
				;
				break;
			}
			case "9": {
				library.sort_by_year_new();
				break;
			}
			case "10": {
				library.show_library();;
				break;
			}
			case "11": {
				System.exit(7);
				break;
			}
			}

		}
	}
}