package com.ljt.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionEach {
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("java");
		books.add("android");
		books.add("ios");
//		books.forEach(obj->System.out.println("迭代集合元素"+obj));
		Iterator it = books.iterator();
//		while(it.hasNext()){
//			String book=(String) it.next();
//			if(book.equals("android")){
//				it.remove();
//			}
//		}

//		it.forEachRemaining(obj->System.out.println("迭代集合元素:"+obj));
		//使用lambda表达式过滤集合
		books.removeIf(ele -> ((String)ele).length()<10);
		System.out.println("集合="+books);
	}

}
