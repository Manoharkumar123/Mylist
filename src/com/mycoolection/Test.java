package com.mycoolection;

public class Test {

	public static void main(String[] args) {
		DoubleLinklist list=new DoubleLinklist();
		list.add(10);
		list.add(20);
		list.add(40);
		Miterator it=list.myiterator();
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println(i);
		}
	}
}
