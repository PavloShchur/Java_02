package Generic;

public class Main {

	public static void main(String[] args) {
		final SimpleGeneric<String> simpleGeneric = new SimpleGeneric<String>("l", "r");
		System.out.println(simpleGeneric.getLeft());
		final SimpleGeneric<Integer> simpleGeneric2 = new SimpleGeneric<Integer>(1, 2);
		System.out.println(simpleGeneric2.hetRight());
		final SimpleGeneric<superClass> simpleGeneric3 =
				new SimpleGeneric<Main.superClass>(new superClass(), new superClass());
				System.out.println(simpleGeneric3.getLeft());
				
//		SimpleGenericManyTypes<Long, String> genericManyTypes =
//				new SimpleGenericManyTypes<Long, String>(15L, "Andrey");
//		System.out.println(genericManyTypes.getLeft() + " " + genericManyTypes.getRight());
	}
	
	private static class superClass {
		@Override
		public String toString() {
			return "super";
		}
	}

}


