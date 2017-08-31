package Java_util;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		System.out.println("Початковий розмір спискового масиву al: " + al.size());

		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("Розмір спискового масиву al після вводу елементів: " + al.size());
		System.out.println("Вміст спискового масиву al: " + al);

		al.remove("F");
		al.remove(2);
		System.out.println("Розмір спискового масиву al після видалення елементів: " + al.size());
		System.out.println("Вміст спискового масиву al: " + al);

	}

}
