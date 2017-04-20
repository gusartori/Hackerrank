package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 12/04/17.
 */
public class LeftRotation {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 1; i <= m; i++) {
            int temp = array[0];
            for (int j = 1; j < array.length; j++) {
                array[j-1] = array[j];
            }
            array[array.length-1] = temp;
        }
        for(int x: array){
            System.out.print(x+ " ");
        }
    }

}
