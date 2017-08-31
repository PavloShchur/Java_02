package Zoo_club;

public interface Entry<K, V> {
	K getKey();
	V getValue();
	V setValue(V value);
	
}
