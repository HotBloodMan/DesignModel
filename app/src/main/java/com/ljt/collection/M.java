package com.ljt.collection;

import java.util.TreeSet;

//定制排序
public class M {
	int age;
	public M(int age) {
		super();
		this.age = age;
	}
	@Override
	public String toString() {
		return "M [age=" + age + "]";
	}
	public static void main(String[] args) {
		//此处Lambda表达式的目标类型是Comparator
		TreeSet ts=new TreeSet((o1,o2) ->{
			M m1=(M)o1;
			M m2=(M)o2;
			return m1.age> m2.age? -1:m1.age<m2.age?1:0;
		});
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		System.out.println(ts);

	}
}
