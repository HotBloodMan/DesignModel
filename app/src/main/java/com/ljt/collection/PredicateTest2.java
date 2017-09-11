package com.ljt.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("java");
		books.add("android");
		books.add("ios");
		System.out.println(calAll(books,ele->((String)ele).contains("java")));
		System.out.println(calAll(books,ele->((String)ele).contains("and")));
		//统计书名字符串长度大于5的图书数量
		System.out.println("结论："+calAll(books,ele->((String)ele).length() > 5));

	}
	public static int calAll(Collection books,Predicate p){
		int total=0;
		for(Object obj : books)
		{
			//使用Predicate的test()方法判断该对象是否满足Predicate指定的条件
			if(p.test(obj))
			{
				total++;
			}
		}
		return total;
	}
}
