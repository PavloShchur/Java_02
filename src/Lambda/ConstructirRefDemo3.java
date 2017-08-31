package Lambda;

public class ConstructirRefDemo3 {
static <R, T> R myClassFactory(MyFunction<R, T> cons, T v) {
	return cons.func(v);
}
	public static void main(String[] args) {
		MyFunction<MyClass_02<Double>, Double> myClassCons = MyClass_02<Double>::new;
		MyClass_02<Double> mc = myClassFactory (myClassCons, 100.1);
		
		System.out.println("�������� val � ����� mc ������ " + mc.getVal());
		
		MyFunction<MyClass2, String> myClassCons2 = MyClass2::new;
		
		MyClass2 mc2 = myClassFactory(myClassCons2, "������");
		
		System.out.println("�������� str � ����� mc2 ������ " + mc2.getStr());
		
	}

}
