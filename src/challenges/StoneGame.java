package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 29/03/17.
 */
public class StoneGame {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n%7==0 || n%7==1){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
        sc.close();
    }

}
