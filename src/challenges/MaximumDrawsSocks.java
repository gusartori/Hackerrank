package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 07/04/17.
 */
public class MaximumDrawsSocks {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==1){
                System.out.println(2);
            } else {
                System.out.println(2 * n - 1);
            }
        }
        sc.close();
    }
}
