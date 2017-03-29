package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 28/03/17.
 */
public class Candles {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int height[] = new int[n];
            int tallest = 0;
            for(int height_i=0; height_i < n; height_i++){
                height[height_i] = in.nextInt();
                if (height[height_i]>=tallest){
                    tallest = height[height_i];
                }
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                if(height[i]==tallest){
                    result++;
                }
            }
            System.out.println(result);
        }
}
