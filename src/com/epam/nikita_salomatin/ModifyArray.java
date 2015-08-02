package com.epam.nikita_salomatin;

import java.util.Scanner;

public class ModifyArray {
	private int taskNumber;
	private int[] modifiedArray;
	
	public void modify(int taskNumber) {
		
		this.taskNumber=taskNumber;
		
		switch (taskNumber) {
	
        case 1:   
        		 Array array = new Array();
                 modifiedArray = array.getArray();
                 for(int i=0;i<modifiedArray.length;i++) {
                	 System.out.print(modifiedArray[i] + " ");
                 }
                 
                 break;
        
        default: System.out.println("\n" + "Invalid task number");
                 break;
        }
	}
	
	public void toPrepare() {
		
		 System.out.println("\n" + "Type task number:");
		 Scanner in = new Scanner(System.in); 
		 taskNumber = in.nextInt();
		 ModifyArray modifiedArray = new ModifyArray();
		 modifiedArray.modify(taskNumber);
		 in.close();
		
	}
	
	
}

