package com.epam.nikita_salomatin;

import java.util.Scanner;

public class Array {

    
    private int[] myArray;
	private static int arrayLength, arrayMinValue, arrayMaxValue, taskNumber;
	//��������� ������ ����������
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
		//�������� ��������� �������
		System.out.print("Array:=");
	    for(int i=0;i<myArray.length;i++) {
	    myArray[i] = array.getRandomValue(arrayMinValue, arrayMaxValue);
	    System.out.print(myArray[i] + " ");
	    }
	    
	     
	}
	
	//������� �����
	public void modify(int taskNumber) {
		
		
		
		switch (taskNumber) {
	
        case 1:  //� ������� ����� ����� �������� ������� ������������ ������������� ������� � ����������� �������������
        
        		 try {
        			 
        			 System.out.println("\n" + "Modified array:=");
        			 //�������� �������� ������
        			 int modifiedArray[] = getArray();
        			 int maxElem = arrayMaxValue, minElem = 0, countNegativeValue = 0, countPositiveValue = 0, positionMin = 0, positionMax = 0;
        			 for(int i=0;i<modifiedArray.length;i++) {
            			
            			//���� �� �����. ��������
            			if (modifiedArray[i]<0) {
            				countNegativeValue++;
            			}
            			//���� ����, �������
            			if (i==arrayLength-1 && countNegativeValue==0) {
            				System.out.println("There are no negative values");
            				break;
            			}
            			
            			//���� �� �������. ��������
            			if (modifiedArray[i]>=0) {
            				countPositiveValue++;
            				//����� ������������ ��������������
            				if (modifiedArray[i]<maxElem) {
            					maxElem=modifiedArray[i];
            					positionMax = i+1;
            					
            				}
            			}
            			//���� ����, �������
            			if (i==arrayLength-1 && countPositiveValue==0) {
            				System.out.println("There are no positive values");
            				break;
            			}
            			
            			//����� ����������� ��������������
            			if (modifiedArray[i]<minElem) {
            				minElem=modifiedArray[i];
            				positionMin = i+1;
            			}
            			//����� �������� � �������
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
	   //������ �� ���������� ���������
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
