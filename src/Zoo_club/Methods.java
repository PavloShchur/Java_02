package Zoo_club;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Methods {

	private Map<Person, List<Pet>> map = new HashMap<>();
	private Set<Entry<Person, List<Pet>>> set;

	public Map<Person, List<Pet>> getMap() {
		return map;
	}

	public int getMapSize() {
		return map.size();
	}

	public void setMap(Map<Person, List<Pet>> map) {
		this.map = map;
	}

	//
	// public void printPets() {
	// for (Pet pet : Pet.values()) {
	// System.out.print(pet + " ");
	// }
	// System.out.println();
	// }

	// // public void show_all_pets() {
	// // for (Pet p: pets) {
	// // System.out.println(p);
	// // }
	// // }
	// // private Map<Person, List<Pet>> map = new HashMap<>();
	// // private Set<java.util.Map.Entry<Person, List<? extends Pet>>> set;
	//
	// private Map<Person, List<Pet>> map = new HashMap<>();
	// private Set<Entry<Person, List<Pet>>> set;
	//
	// public Map<Person, List<Pet>> getMap() {
	// return map;
	// }
	//
	// public int getMapSize() {
	// return map.size();
	// }
	//
	// public void setMap(Map<Person, List<Pet>> map) {
	// this.map = map;
	// }
	//
	// public void makeFile() {
	// File file = new File("Zooclub");
	// if (!(file.exists())) {
	// try {
	// file.createNewFile();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	//
	// }
	// }

	//

	public void add_person() {
		System.out.println("Ent er name of person");
		String name = Main.scanner.next();
		System.out.println("Enter age");
		int age = Main.scanner.nextInt();
		System.out.println("Enter name of pet");
		String name_of_pet = Main.scanner.next();
		System.out.println("Enter type of pet");
		String type_of_pet = Main.scanner.next();
		map.put(new Person(name, age), Arrays.asList(new Pet(type_of_pet, name_of_pet)));
	}
}
// }
//
// Zoo_club zoo_club = new Zoo_club();
// // public void remove() {
// // String nameq = Main.scanner.next();
// //
// // if (zoo_club.map.get(person.getName()).equals(nameq)) {
// // zoo_club.map.remove(person.getName());
// // }
//
// public void add_participator() {
// System.out.println("Enter name of person");
// String name = Main.scanner.next();
// System.out.println("Enter name age of person");
// int age = Main.scanner.nextInt();
// // System.out.println("Enter name of pet");
// // String name_of_pet = Main.scanner.next();
// // System.out.println("Enter type of pet");
// // String type_of_pet = Main.scanner.next();
//
// map.put(new Person(name, age), new ArrayList<Pet>());
// }
//
// public void add_animal_to_participator() {
// // System.out.println("Enter name of Person :");
// // String name = Main.scanner.next();
// // for (Iterator<Person> it = zoo_club.petPeaple.keySet().iterator();
// // it.hasNext();)
// // if (it.next().getName().equalsIgnoreCase(name)) {
// // System.out.println("Enter a name of Animal : ");
// // String name_of_pet = Main.scanner.nextLine();
// // System.out.println("Enter a type of Animal");
// // String type_of_pet = Main.scanner.nextLine();
// // .add(new Pet(type_of_pet, name_of_pet));
// //
// // }
// System.out.println("Enter name of Person :");
// String name = Main.scanner.nextLine();
// Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
// while (iterator.hasNext()) {
// Entry<Person, List<Pet>> entry = iterator.next();
// if (entry.getKey().getName().equalsIgnoreCase(name)) {
// System.out.println("Enter a name of Animal : ");
// String name_of_pet = Main.scanner.nextLine();
// System.out.println("Enter a type of Animal : ");
// String type_of_pet = Main.scanner.nextLine();
// entry.getValue().add(new Pet(type_of_pet, name_of_pet));
// }
// }
//
// }
//
// //
// // System.out.println("Enter name of Person :");
// // String name = Main.scanner.nextLine();
// // Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
// // while (iterator.hasNext()) {
// // Entry<Person, List<Pet>> entry = iterator.next();
// // if (entry.getKey().getName().equalsIgnoreCase(name)) {
// // System.out.println("Enter a name of Animal : ");
// // String name_of_pet = Main.scanner.nextLine();
// // System.out.println("Enter a type of Animal (choose from :)");
// // String type_of_pet = Main.scanner.nextLine();
// // entry.getValue().add(new Pet(type_of_pet, name_of_pet));
// // } else {
// // System.out.println("We do not have such a participator");
// // }
// // }
//
//
// public void delete_animal_from_participator() {
// System.out.println("Enter name of Person :");
// String name = Main.scanner.nextLine();
//
// Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
// while (iterator.hasNext()) {
// Entry<Person, List<Pet>> entry = iterator.next();
// if (entry.getKey().getName().equalsIgnoreCase(name)) {
// System.out.println("Enter a name of Animal : ");
// String nameofAnimal = Main.scanner.nextLine();
//
// Collection<? extends Pet> animals = entry.getValue();
// Iterator<? extends Pet> iterator2 = animals.iterator();
// while (iterator2.hasNext()) {
// Pet pet = iterator2.next();
// if (pet.getName_of_pet().equalsIgnoreCase(nameofAnimal)) {
// iterator2.remove();
// }
// }
// }
// }
// }
//
// // for (int i = 0; i < 30; i++) {
// // zoo_club.personMap.put(new Person(name, age), Arrays.asList(new
// // Pet(type_of_pet, name_of_pet)));
// // }
// // System.out.println("personMap.keySet(): " +
// // zoo_club.personMap.keySet());
//
// // for(Person person1 : zoo_club.personMap.keySet()){
// // System.out.println(person1 + " имеет");
// // for (Pet pet : zoo_club.personMap.get(person1)){
// // System.out.println(" " + pet);
// // break;
// // }
// //
// // personMap.put(new Person("Ирина"), Arrays.asList(new Cat("Рыжик"),
// // new Dog("Шарик"), new Parrot("Гоша")));
//
// void remove() {
// System.out.println("Enter name");
// String nameq = Main.scanner.next();
// for (Iterator<Person> it = map.keySet().iterator(); it.hasNext();)
// if (nameq.equals(it.next().getName())) {
// it.remove();
//
// }
// //
// // }
// // zoo_club.petPeaple.remove(Arrays.asList(new Pet(nameq, nameq)));
//
// // System.out.println("Enter name2");
// // String nameq2 = Main.scanner.next();
// // zoo_club.petPeaple.entrySet().stream().filter(person ->
// // person.getKey().getName().equals(nameq2))
// // .collect(Collectors.toMap(p -> p.getKey(), p ->
// // p.getValue())).forEach((person, pets) -> {
// // pets.removeIf(pet ->
// // pets.iterator().next().getName_of_pet().equals(nameq2));
// // pets.iterator().remove();
// // });
//
// // System.out.println("Enter nameoo");
// // String nameq = Main.scanner.next();
// //
// // for (int i=0; i<zoo_club.size(); i++) {
// // System.out.println("qwqw");
// // Pet val = pets.get(i);
// // if (val.getName_of_pet().equals(nameq)) {
// // pets.remove(i);
// // System.out.println("qwqw");
// // break;
// // }
// // }
// //
// // System.out.println("Enter name");
// // String nameq = Main.scanner.next();
// // for (Iterator<Person> it = zoo_club.personMap.keySet().iterator();
// // it.hasNext();)
// // if (nameq.equals(it.next().getName())) {
// // it.next().removeAll(pets);
// // it.next().removeIf(pet -> pet.getName_of_pet().equals(nameq));
// // System.out.println("dcv");
// // zoo_club.personMap.remove(pets.iterator().next().getName_of_pet());
//
// }
//
// // System.out.println(zoo_club.personMap);
// // for (int i=0; i<pets.size(); i++) {
// // Pet val = pets.get(i);
// // if (val.getName_of_pet().equals(nameq)) {
// // pets.remove(i);
// // break;
// // }
// // }
// //
// //
//
// //
// // map.entrySet().stream().filter(person ->
// // person.getName().equals(name)).collect(Collectors.toMap(p -> p.getKey(),
// // p -> p.getValue())).forEach((person, pets) -> {
// // pets.removeIf(pet -> pet.getName().equals(nickname));
// // });
//
// // System.out.println("Enter name");
// // String nameq = Main.scanner.next();
// // for (Iterator<Person> it = zoo_club.personMap.keySet().iterator();
// // it.hasNext();)
// // if (nameq.equals(it.next().getName())) {
// //
// zoo_club.personMap.entrySet().remove(pets.stream().findAny().get().getName_of_pet());
// // it.next().iterator().next().remove(pets.remove(pets));
// // it.next().removeAll(pets);;
//
// // Pet key = new Pet(nameq, nameq);
// // zoo_club.personMap.remove(key);
//
// // it.remove(new Pet(nameq, nameq));
// // for (int i=0; i<pets.size(); i++) {
// // Pet val = pets.get(i);
// // if (val.equals(nameq)) {
// // pets.remove(i);
// // break;
// // }
// // }
//
// // for(Pet child : pets){
// // for(Pet key : pets){
// // if(child.getName_of_pet().equals(nameq))
// // child.remove(key);
//
//
//// public void show_all() {
//// set = map.entrySet();
//// Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
//// while(iterator.hasNext()) {
//// System.out.println(iterator.next());
//// }
// public void printZooClub() {
// set = map.entrySet();
// Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
// while (iterator.hasNext()) {
// System.out.println(iterator.next());
// }
// }
//
//// System.out.println("personMap: " + map);
//
// // for(Person person : zoo_club.petPeaple.keySet()){
// // System.out.println(person);
// // System.out.print("personMap: " + zoo_club.petPeaple);
// //
// // }
//
// // zoo_club.petPeaple.forEach((k, v) -> System.out.println("Key : " + k + "
// // Value : " + v));
//
// public Entry<Person, List<Pet>>
// iterateThroughCollection(Iterator<Entry<Person, List<Pet>>> iterator) {
// while (iterator.hasNext()) {
// Entry<Person, List<Pet>> entry = iterator.next();
// return entry;
// }
// return null;
// }
//
// public Entry<Person, List<Pet>> getEntry() {
// Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
// Entry<Person, List<Pet>> entry = iterator.next();
// return entry;
// }
//
// public void addAnimalToMember() {
// System.out.println("Enter name of Person :");
// String name = Main.scanner.nextLine();
//
// Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
// while (iterator.hasNext()) {
// Entry<Person, List<Pet>> entry = iterator.next();
// if (entry.getKey().getName().equalsIgnoreCase(name)) {
// System.out.println("Enter a name of Animal : ");
// String nameOfAnimal = Main.scanner.nextLine();
// System.out.println("Enter a type of Animal (choose from :)");
// String type = Main.scanner.nextLine();
// entry.getValue().add(new Pet(nameOfAnimal, type));

////
//// System.out.println(zoo_club.personMap);
