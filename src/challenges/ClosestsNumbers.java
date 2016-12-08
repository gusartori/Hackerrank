package challenges;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Gustavo on 29/11/16.
 */
public class ClosestsNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        orderArrays(a);

        IntStream differences = IntStream.range(0,a.length-1).map(i -> a[i+1] - a[i]);
        for(int a_i=0; a_i < n; a_i++){
            System.out.print(a[a_i]+" ");
        }
    }

    public static void orderArrays(int[] a){
        Arrays.sort(a);
    }
}
