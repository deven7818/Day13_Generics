package com.generics;

public class MaxString {
	
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
	
		String sArr1[] = {"Mumbai" , "Pune", "Dhule"};
		String sArr2[] = {"Indore","Nagpur","Dehli"};
		String sArr3[] = {"Kolkata","Nashik","Surat"};

		
		findMax(sArr1);
		findMax(sArr2);
		findMax(sArr3);

	}
	}

