package Zoo_club;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Zoo_club {
	private Map<Person, List<Pet>> map = new HashMap<>();
	private Set<Entry<Person, List<Pet>>> set;

	public Map<Person, List<Pet>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Pet>> map) {
		this.map = map;
	}

	public void add_participator() {
		System.out.println("Enter a name of Person : ");
		String name = Main.scanner.next();
		System.out.println("Enter age of Person : ");
		int age = Main.scanner.nextInt();
		map.put(new Person(name, age), new ArrayList<Pet>());
	}

	public void add_pet_to_member() {
		System.out.println("Enter name of Person :");
		String name = Main.scanner.next();

		Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)) {
				System.out.println("Enter a name of Animal : ");
				String name_of_pet = Main.scanner.next();
				System.out.println("Enter a type of Animal");
				String type_of_pet = Main.scanner.next();
				entry.getValue().add(new Pet(type_of_pet, name_of_pet));
			}
		}

	}
	//
	// public void printPets() {
	// for (Pet pet : Pet.values()) {
	// System.out.print(pet + " ");
	// }
	// System.out.println();
	// }

	public void delete_animal_from_member() {
		System.out.println("Enter name of Person :");
		String name = Main.scanner.next();

		Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)) {
				System.out.println("Enter a name of Animal : ");
				String name_of_Animal = Main.scanner.nextLine();

				Collection<Pet> animals = entry.getValue();
				Iterator<Pet> iterator2 = animals.iterator();
				while (iterator2.hasNext()) {
					Pet pet = iterator2.next();
					if (pet.getName_of_pet().equalsIgnoreCase(name_of_Animal)) {
						iterator2.remove();
					}
				}
			}
		}
	}

	public void delete_member() {
		System.out.println("Enter name of Person :");
		String name = Main.scanner.next();

		Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)) {
				iterator.remove();
			}
		}
	}

	public void delete_animal_from_all_members() {
		System.out.println("Enter a name of Animal : ");
		String nameOfAnimal = Main.scanner.next();
		System.out.println("Enter type of Animal : ");
		String typeOfAnimal = Main.scanner.nextLine();

		Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> entry = iterator.next();

			Collection<Pet> animals = entry.getValue();
			Iterator<Pet> iterator2 = animals.iterator();
			while (iterator2.hasNext()) {
				Pet pet = iterator2.next();
				if (pet.getName_of_pet().equalsIgnoreCase(nameOfAnimal)
						& pet.getType_of_pet().equalsIgnoreCase(typeOfAnimal))
					iterator2.remove();
			}
		}
	}

	public void print_zoo_club() {
		set = map.entrySet();
		Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public Entry<Person, List<Pet>> getEntry() {
		Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
		Entry<Person, List<Pet>> entry = iterator.next();
		return entry;
	}
}