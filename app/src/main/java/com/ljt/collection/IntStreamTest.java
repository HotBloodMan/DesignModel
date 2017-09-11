package com.ljt.collection;

import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;

public class IntStreamTest {

	public static void main(String[] args) {
		IntStream is = IntStream.builder()
				.add(20)
				.add(13)
				.add(18)
				.build();
		System.out.println("is所有元素的最大值："+is.max().getAsInt());
		System.out.println("is所有元素的总和："+is.sum());
		System.out.println("is所有元素的总数："+is.count());
		System.out.println("is所有元素的平均值："+is.average());
		System.out.println("is所有元素的平方是否大于20："+
				is.allMatch(ele->ele*ele>20));


	}

}
