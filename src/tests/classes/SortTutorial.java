package tests.classes;

import java.util.Scanner;

public class SortTutorial {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
        int n = sc.nextInt();
        int [] ar =  new int [n];
        int result = -1;
        for (int i = 0 ; i < n ; i++){
        	ar[i] =  sc.nextInt();
        	if (ar[i] == v){
        		result = i;
        		break;
        	}
        }
        System.out.println(result);
        
    }
}

