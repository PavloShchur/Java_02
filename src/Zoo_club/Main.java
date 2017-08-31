package Zoo_club;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Zoo_club zooClub = new Zoo_club();
		boolean work = true;

		while (work) {
			Menu menu = new Menu();
			menu.menu();
			String choice = Main.scanner.next();
			switch (choice) {
			case "1": {
				zooClub.add_participator();
				break;
			}
			case "2": {
				zooClub.add_pet_to_member();
				break;
			}
			case "3": {
				zooClub.delete_animal_from_member();
				break;
			}
			case "4": {
				zooClub.delete_member();
				break;
			}
			case "5": {
				zooClub.delete_animal_from_all_members();
				break;
			}
			case "6": {
				zooClub.print_zoo_club();
				break;
			}
			case "7": {
				System.exit(7);
				break;
			}

			default:
				break;
			}

		}
	}
}