package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 29/03/17.
 */
public class ApplesAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        int appleCount = 0;
        for (int i = 0; i < apple.length; i++) {
            if(apple[i]>0){
                if(s <= apple[i]+a && apple[i]+a<=t){
                    appleCount++;
                }
            }
        }
        int orangeCount = 0;
        for (int i = 0; i < orange.length; i++) {
            if(orange[i]<0){
                if(s<=orange[i]+b&&orange[i]+b<=t){
                    orangeCount++;
                }
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
