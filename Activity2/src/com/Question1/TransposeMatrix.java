package com.Question1;

import java.util.Scanner;

public class TransposeMatrix {
	
		 int i, j,temp;
		 int row,column;
		 int array[][] = new int[row][column];  
		 int transpose[][]=new int [row][column];
		 
		 
		 System.out.println("Enter rows:");
		 Scanner s=new Scanner(System.in);
	     row = s.nextInt(); 	
	     //accessing the elements using scanner class
	     System.out.println("enter column :");
	     column = s.nextInt(); 
		 
		 void read(Scanner s) 
		 {
			  
		     int array[][] = new int[row][column];  
		    System.out.println("Enter matrix:");  
		    for(i=0;i<row;i++)  
		    {  
		        for(j=0;j<column;j++)   
		            {  
		            array[i][j]=s.nextInt();  
		        //    System.out.print(" "); 
		            
		            }  
		    }  
		 }
		 
		 void trans()
		 {
		 System.out.println("The above matrix before Transpose is: ");  
		
		    for(i=0;i<row;i++)  
		        {  
		            for(j=0;j<column;j++)  
		            {  
		            	transpose[i][j]=array[j][i];
		            	
		            System.out.print(transpose[i][j]+" ");  
		            }  
		           System.out.println(" ");  
		        }
		    
		    
		    
		   /* for(i=0;i<column;i++)
		    for(j=i+1;j<column;j++)
		    {
		    	temp=array[i][j];
		    	array[i][j]=array[j][i];      //transposing the matrix 
		    	array[j][i]=temp;
		    }*/
		    
		        }  
		 
		 void display()
		 {
			 //displaying the matrix 
		 System.out.println("The above matrix after Transpose is :");  
		 int array[][] = new int[row][column];  
		    for(i=0;i<column;i++)  
		        {  
		            for(j=0;j<row;j++)  
		            {  
		                System.out.print(array[i][j]+" ");  
		            }  
		            System.out.println(" ");  
		        }  
		    }  
		 

	}

