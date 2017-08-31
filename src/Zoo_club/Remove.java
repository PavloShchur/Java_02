package Zoo_club;

import java.util.HashMap;

public class Remove {
	public static void main(String[] args) {
		
	
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    map.put("a", 1);
    map.put("b", 2);

    System.out.println("Before removal");
    for( String s : map.keySet() ) {
        System.out.println( s );
    }

    System.out.println("\n\nAfter removal");

    map.remove("a");
    for( String s : map.keySet() ) {
        System.out.println( s );
    }
}}
