package tests.classes;
import java.util.Scanner;
public class InsertionSort1 {
	 public static void insertIntoSorted(int[] ar) {
	        // Fill up this function  
		 int newElement = ar[ar.length-1];
		 for (int i = ar.length-2; i>=0; i--){
			 if (ar[i]>newElement && i!=0){
				 ar[i+1] = ar[i];
				 printArray(ar);
			 } else if (ar[i]>newElement && i==0){
				 ar[i+1] = ar[i];
				 ar[i] = newElement;
				 printArray(ar);
				 break;
			 } else {
				 ar[i+1] = newElement;
				 printArray(ar);
				 break;
			 }
		 }
	    }
	 

		 public static void insertSorted(int[] ar) {
		         for (int i = 1; i < ar.length; ++i){
		                 if (ar[i] < ar[i - 1]) {
		                         int temp = ar[i];
		                         int j;
		                         for (j = i; j > 0 && ar[j - 1] > temp ; --j){
		                                 ar[j] = ar[j - 1];
		                                 printArray(ar);
		                         }
		                         ar[j] = temp;
		                         printArray(ar);
		                 }
		         }
		 }

//			 public void insertIntoSorted(int[] ar) {
//			         for (int i = 1; i < ar.length; ++i){
//			                 if (ar[i] >=  ar[i - 1])
//			                         continue;
//			                 
//			                 int temp = ar[i];
//			                 int j = i;
//			                 for (j = i; ar[j - 1] > temp && j > 0; --j)
//			                         ar[j] = ar[j - 1];
//			                 ar[j] = temp;
//			         }
//			 }

	    
	    
	/* Tail starts here */
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	        for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	        }
	        insertSorted(ar);
	    }
	    
	    
	    private static void printArray(int[] ar) {
	        for(int n: ar){
	            System.out.print(n+" ");
	        }
	        System.out.println("");
	    }
}
