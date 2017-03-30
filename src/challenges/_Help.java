package challenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gustavo on 29/03/17.
 */
public class _Help {
    /*
    Many ways for start/input on Hackerrank problems
     */

    /*
        Input form:
        n = 3
        array = 1 3 2
     */
    public static void main4 (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer [] array = new Integer[n];
        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }
        scan.close();
    }

    /*
    Input form:

            3 2
            2 5 6

    where:
    n = 3 ; m = 2 ; array = 2 5 6
            */
    public static void main1 (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer [] array = new Integer[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        sc.close();
    }

    /*
    Input form:

            3
            2 5

    where:
    t = 3 ; n = 2 ; m = 5
            */
    public static void main2 (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
        }
        sc.close();
    }

    /*
    Input form:

            3
            2
            5 6

    where:
    t = 3 ; n = 2 ; array = 5 6
            */
    public static void main3 (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Integer [] array = new Integer[n];
            for (int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }
        }
        sc.close();
    }


    public static void main (String args[]){
        for (int i = 0; i < 100; i++) {
            double z = Math.pow(10,-5);
            z = z/i;
//            if (z * i != 1.0)
                System.out.println(" " + z);
        }
    }
}
