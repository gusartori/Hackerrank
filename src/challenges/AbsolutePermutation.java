package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 29/03/17.
 */
public class AbsolutePermutation {

    public static void main2 (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            smallestPermutation(n,k);
        }
        sc.close();
    }

    public static void smallestPermutation(int n, int k) {
        int g;
        boolean possible;

        if(k != 0) {
            possible = n % k == 0 && n / k % 2 == 0;
        } else {
            possible = true;
        }

        if(possible) {
            for(int i=0; i<n; i++) {
                g = k == 0 ? i : i / k;
                System.out.print(i + 1 + (g % 2 == 0 ? k : -k));
                System.out.print(" ");
            }
        } else {
            System.out.print("-1");
        }

        System.out.println();
    }
}
