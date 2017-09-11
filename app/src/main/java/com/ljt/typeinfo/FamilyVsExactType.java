package com.ljt.typeinfo;

class Base{}
class Derived extends Base{}
public class FamilyVsExactType {
	static void test(Object x){
		System.out.println("Testint x of type "+x.getClass());
		System.out.println("x instance Base "+(x instanceof Base));
		System.out.println("x instanceof Derived "+(x instanceof Derived));
		System.out.println("Base.isInstance(X) "+Base.class.isInstance(x));
		System.out.println("Derived.isInstance(X) "+Derived.class.isInstance(x));
		System.out.println("x.getClass() == Base.class "+(x.getClass() == Base.class));
		System.out.println("x.getClass() == Derived.class "+(x.getClass() == Derived.class));
		System.out.println("x.getClass().equals(Base.class)) "+(x.getClass().equals(Base.class)));
		System.out.println("x.getClass().equals(Derived.class)) "+(x.getClass().equals(Derived.class)));
		
	}
	public static void main(String[] args) {
		test(new Base());
		System.out.println("================================");
		test(new Derived());
	}
	

}
