package challenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gustavo on 10/04/17.
 */
public class ChocolateFiesta {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
            if(array[i]%2==0){
                evens.add(array[i]);
            }
        }
        scan.close();
        int total = 1;
        for (int i = 2; i < evens.size(); i++) {
            total *= i;
        }
        System.out.println(evens.size()+total);


    }

}
