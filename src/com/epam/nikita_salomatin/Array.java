package com.epam.nikita_salomatin;

import java.util.Scanner;

public class Array {

	int i;
	static int arrayLength, arrayMinValue, arrayMaxValue;
	int[] myArray;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Type array length:");
		 Scanner in = new Scanner(System.in); 
		 arrayLength = in.nextInt();
		 System.out.println("Type array min value:");
		 arrayMinValue = in.nextInt();
		 System.out.println("Type array max value:");
		 arrayMaxValue = in.nextInt();
		 Array array = new Array();
		 array.build(arrayLength);
		 in.close();
		 
	}
	
	
	public void build (int arrayLength) {
		
		Array array = new Array();
		myArray = new int [arrayLength];
		
	    for(int i=0;i<myArray.length;i++) {
	    myArray[i] = array.getRandomValue(arrayMinValue, arrayMaxValue);
	    System.out.print(myArray[i] + " ");
	    }
	  
	}
	
	public void change1 () {
		
	}
	
	private int getRandomValue(int min, int max) {
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}

}
