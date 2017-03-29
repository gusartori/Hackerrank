package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 28/03/17.
 */
public class TowerBreakers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int m=in.nextInt();
            if (n%2==0||m==1){
                System.out.println("2");
            } else {
                System.out.println("1");
            }

        }
    }
}
