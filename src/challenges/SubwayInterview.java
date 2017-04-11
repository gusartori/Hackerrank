package challenges;

import java.util.*;

/**
 * Created by Gustavo on 07/04/17.
 */
public class SubwayInterview {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int b=sc.nextInt();
            if(n==b){
                System.out.println(1);
            } else {
                int lower = n>b?b:n;
                int maxSize = 1;
                for (int i = 2; i < lower; i++) {
                    if(n%i==0 && b%i==0){
                        maxSize = i;
                    }
                }
                System.out.println((n*b)/(maxSize*maxSize));
            }
        }

        sc.close();
    }
}
