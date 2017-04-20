package challenges;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Gustavo on 11/04/17.
 */
public class ConnectingTowns {



    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int paths = 1;
            for (int i = 0; i < n-1; i++){
                int p = sc.nextInt();
                paths = paths%1234567 * p%1234567;
            }
            System.out.println(paths%1234567);
        }
        sc.close();
    }
}
