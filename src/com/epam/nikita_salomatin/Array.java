package com.epam.nikita_salomatin;

import java.util.Scanner;

public class Array {

    
    private int[] myArray;
	private static int arrayLength, arrayMinValue, arrayMaxValue, taskNumber;
	//Получение нужной информации
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Array array = new Array();
		 array.toPrepare();
		 array.build(arrayLength);
		 array.modify(taskNumber);
 
	}
	
	
	public void build (int arrayLength) {
		
		Array array = new Array();
		myArray = new int [arrayLength];
		//Создание исходного массива
		System.out.print("Array:=");
	    for(int i=0;i<myArray.length;i++) {
	    myArray[i] = array.getRandomValue(arrayMinValue, arrayMaxValue);
	    System.out.print(myArray[i] + " ");
	    }
	    
	     
	}
	
	//Решения задач
	public void modify(int taskNumber) {
		
		
		
		switch (taskNumber) {
	
        case 1:  //В массиве целых чисел поменять местами максимальный отрицательный элемент и минимальный положительный
        
        		 try {
        			 
        			 System.out.println("\n" + "Modified array:=");
        			 //Получаем исходный массив
        			 int modifiedArray[] = getArray();
        			 int maxElem = arrayMaxValue, minElem = 0, countNegativeValue = 0, countPositiveValue = 0, positionMin = 0, positionMax = 0;
        			 for(int i=0;i<modifiedArray.length;i++) {
            			
            			//Есть ли отриц. элементы
            			if (modifiedArray[i]<0) {
            				countNegativeValue++;
            			}
            			//Если нету, выходим
            			if (i==arrayLength-1 && countNegativeValue==0) {
            				System.out.println("There are no negative values");
            				break;
            			}
            			
            			//Есть ли положит. элементы
            			if (modifiedArray[i]>=0) {
            				countPositiveValue++;
            				//Поиск минимального положительного
            				if (modifiedArray[i]<maxElem) {
            					maxElem=modifiedArray[i];
            					positionMax = i+1;
            					
            				}
            			}
            			//Если нету, выходим
            			if (i==arrayLength-1 && countPositiveValue==0) {
            				System.out.println("There are no positive values");
            				break;
            			}
            			
            			//Поиск максимально отрицательного
            			if (modifiedArray[i]<minElem) {
            				minElem=modifiedArray[i];
            				positionMin = i+1;
            			}
            			//Вывод значения и позиции
            			if (i==arrayLength-1) {
        					System.out.println("maxElem=" + maxElem + " " + "Position=" + positionMax);
        					System.out.println("minElem=" + minElem + " " + "Position=" + positionMin);
        				}
            		
            		 }
            		 
        		  }  catch (NullPointerException e) {
    				 System.out.print("\n" + "Got null value");
    				 
    			}
        		 
        		 break;
        		
       default: System.out.println("\n" + "Invalid task number");
                 break;
        }
	}
	   //Рандом из кастомного диапозона
	private int getRandomValue(int min, int max) {
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	
	
	
	public int[] getArray() {
		
		 return this.myArray;
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
	
	
	
	
	

}
