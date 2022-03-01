package com.generics;


//Generic class extends Comparable class
public class Refactor_2<T extends Comparable<T>> {
	
	public T x,y,z;
	
	//Paramerterized Constructor
	public Refactor_2(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//Generic Method to find Max values
	public static  <T extends Comparable<T>> T findMax(T x,T y, T z) {
		T max = x;
	
		if(y.compareTo(max)> 0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
	
		return max;
	}
	//method to get value
	
	public void testMax() {
		T maxVal = findMax(x,y,z);
		System.out.println("Max is " +maxVal);	
	}


	public static void main(String[] args) {
		Refactor_2<Integer> iInt = new Refactor_2<Integer>(20, 10, 30);  //declare value
		Refactor_2<String> sString = new Refactor_2<String>("Apple", "Banana", "Papaya"); //declare value
		Refactor_2<Float> ffloat = new Refactor_2<Float>(20.1f, 10.3f, 30.4f); //declare value
		
		
		//calling generic method for all values
		iInt.testMax();
		sString.testMax();
		ffloat.testMax();
	}

}
