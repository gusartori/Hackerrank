package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 22/11/16.
 */
public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        int[] m = new int[q];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            m[a0] = in.nextInt();
        }
        while(k>0){
            rotate(a);
            k--;
        }
        for(int a0 = 0; a0 < q; a0++){
            System.out.println(a[m[a0]]);
        }

    }

    public static void rotate(int[] a){
        int last = a[a.length-1];
        int copy = a[0];
        for(int z = 1; z < a.length; z++){
            int temp = a[z];
            a[z] = copy;
            copy = temp;
        }
        a[0]=last;
    }

    public static void printM(int[] a, int m){
        System.out.println(a[m]);
    }
}
