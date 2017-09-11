package com.ljt.annotation;

import java.util.HashSet;

import org.junit.Test;

public class HashSetTest {
	
	HashSet<String> testObject=new HashSet<String>();
	@Test void initialization(){
	assert testObject.isEmpty();	
	}
	@Test void _contains(){
		testObject.add("one");
		assert testObject.contains("one");
	}
	@Test void _remove(){
		testObject.add("one");
		testObject.remove("one");
		assert testObject.isEmpty();
	}
	public static void main(String[] args) throws Exception {
		OSExecute.command( "java net.mindview.atunit.AtUnit HashSetTest");
	}

}
