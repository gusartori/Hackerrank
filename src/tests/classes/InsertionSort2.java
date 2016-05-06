package tests.classes;

import java.util.Scanner;

public class InsertionSort2 {

	    public static void insertionSortPart2(int[] ar)
	    {       
	           // Fill up the code for the required logic here
	           // Manipulate the array as required
	           // The code for Input/Output is already provided
	         for (int i = 1; i < ar.length; ++i){
	                        
			                 if (ar[i] < ar[i - 1]) {
			                         int temp = ar[i];
			                         int j;
			                         for (j = i; j > 0 && ar[j - 1] > temp ; --j){
			                                 ar[j] = ar[j - 1];
			                                 //printArray(ar);
			                         }
			                         ar[j] = temp;
			                         printArray(ar);
			                 }
	              
			         }
	    }  
	    
	    
	      
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	       int s = in.nextInt();
	       int[] ar = new int[s];
	       for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	       }
	       insertionSortPart2(ar);    
	                    
	    }    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	

}
