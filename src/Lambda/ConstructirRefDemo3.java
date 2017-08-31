package Lambda;

public class ConstructirRefDemo3 {
static <R, T> R myClassFactory(MyFunction<R, T> cons, T v) {
	return cons.func(v);
}
	public static void main(String[] args) {
		MyFunction<MyClass_02<Double>, Double> myClassCons = MyClass_02<Double>::new;
		MyClass_02<Double> mc = myClassFactory (myClassCons, 100.1);
		
		System.out.println("Значення val в оэкты mc складає " + mc.getVal());
		
		MyFunction<MyClass2, String> myClassCons2 = MyClass2::new;
		
		MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");
		
		System.out.println("Значення str в оьєкті mc2 складає " + mc2.getStr());
		
	}

}
