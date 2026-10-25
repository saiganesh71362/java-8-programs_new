package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> list = asList.stream().filter(e->e%2==0).toList();
		
		System.out.println("Even Numbers :"+list);
	}

}
