package com.generics;

public class FloatUc2  {	
	
	public static <T extends Comparable<T>> void findMax(T x, T y, T z) {
		T max = x; // initially assign max to x
		if(y.compareTo(max) > 0) { //compare y with max if it's large then assign max to y
			max = y;
		}
		if(z.compareTo(max)>0) {//compare z with max if it's large then assign max to z
			max = z;
		}
		//print max
		System.out.println("Max number is " +max);
	}
	public static void main(String []args) {
		Double x = 10.10, y = 20.20, z= 20.30; //declare values
		//find max with findMax method
		findMax(x, y, z); // max at 1st 
		findMax(y, x, z); // max at 2nd 
		findMax(y,z,x);  // max at 3rd
	}
}