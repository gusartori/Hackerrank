package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 02/04/17.
 */
public class ChocolateFeast {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int chocolates = 0;
            chocolates = n/c;
            chocolates += chocolates/m + chocolates%m;
            System.out.println(chocolates);
        }
        sc.close();
    }
}
