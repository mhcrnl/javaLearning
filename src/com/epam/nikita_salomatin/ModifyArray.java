package com.epam.nikita_salomatin;


public class ModifyArray {
    int sourceElements;
	private int[] modifiedArray;
	
	public void modify(int taskNumber) {
		
		
		switch (taskNumber) {
	
        case 1:   
        		 Array array = new Array();
                 
        		 sourceElements = array.getElement(1);
        		 System.out.print("Modify:=" + sourceElements + " ");
                 /*for(int i=0;i<5;i++) {
                	 sourceElements = array.getElement(i);
                	 System.out.print(sourceElements + " ");
                 }*/
                 
                 break;
        
        default: System.out.println("\n" + "Invalid task number");
                 break;
        }
	}
	
	
	
}

