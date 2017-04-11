package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 02/04/17.
 */
public class SherlockTheBeast {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int fives = -1;
            int threes = -1;
            if(n>2){
                if(n%3==0){
                    fives = n;
                } else if (n%5==0){
                    threes = n;
                } else {

                }
                System.out.println(fives);
                System.out.println(threes);
            } else{
                System.out.println(-1);
            }

        }
        sc.close();
    }
}
