package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Gustavo on 12/04/17.
 */
public class AlgorithmCrush {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long [] ar = new long[n];
        for (int i = 0; i < m; i++) {
            ar = executeCommand(ar,sc.nextInt(),sc.nextInt(),sc.nextLong());
        }
        sc.close();
        printMax(ar);
    }

    public static long[] executeCommand(long[] ar, int a, int b, long k){
        for (int i = a-1; i <= b-1; i++) {
            ar[i] += k;
        }
        return ar;
    }

    public static void printMax(long [] arr){
        long max = Long.MIN_VALUE;
        for(long x: arr){
            if(x>max){
                max = x;
            }
        }
        System.out.println(max);
    }
}
