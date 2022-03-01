package com.generics;

public class StringUc3 {
	
	public static void findMax(String[] arr) {
		String max="A";
		for (int i=0; i<arr.length;i++) {
			if(arr[i].compareTo(max) >0) {
				max= arr[i];
			}
		}
		System.out.println("max string is " +max);
	}

	
	public static void main(String[] args) {
	
		String sArr1[] = { "Peach","Apple" ,"Banana"};
		String sArr2[] = {"Apple","Watermelon","Banana"};
		String sArr3[] = {"Apple","Banana","Papaya"};

		
		findMax(sArr1);
		findMax(sArr2);
		findMax(sArr3);

	}
	}