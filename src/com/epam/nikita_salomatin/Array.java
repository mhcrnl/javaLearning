package com.epam.nikita_salomatin;

import java.util.Scanner;

public class Array {

    int i;
	
    public int[] myArray;
	private static int arrayLength, arrayMinValue, arrayMaxValue, taskNumber, test;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Array array = new Array();
		 array.toPrepare();
		 array.build(arrayLength);
		 ModifyArray modifiedArray = new ModifyArray();
		 modifiedArray.modify(taskNumber);
		 test = array.getElement(1);
		 System.out.print("Result: " + test);
		 
	}
	
	
	public void build (int arrayLength) {
		
		Array array = new Array();
		myArray = new int [arrayLength];
		
		System.out.print("Array:=");
	    for(int i=0;i<myArray.length;i++) {
	    myArray[i] = array.getRandomValue(arrayMinValue, arrayMaxValue);
	    System.out.print(myArray[i] + " ");
	    }
	    
	     
	}
	
	
	private int getRandomValue(int min, int max) {
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	public int[] getArray() {
		
		 return myArray.clone();
	}
	
	public void setArray(int[] myArray) {
		
		  this.myArray=myArray;
	}
	
	
	public int getElement(int element) {    

		return myArray[element]; 
	} 

	public void setElement(int value, int element) { 
		myArray[element] = value; 
	}
	
	
	private void toPrepare() {
		
		 Scanner in = new Scanner(System.in); 
		 System.out.println("Type array length:");
		 arrayLength = in.nextInt();
		 System.out.println("Type array min value:");
		 arrayMinValue = in.nextInt();
		 System.out.println("Type array max value:");
		 arrayMaxValue = in.nextInt();
		 System.out.println("Type task number:");
		 taskNumber = in.nextInt();
		 in.close();
	}

}
