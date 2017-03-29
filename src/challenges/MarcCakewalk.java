package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Gustavo on 28/03/17.
 */
public class MarcCakewalk {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            Integer [] calories = new Integer[n];
            for (int i = 0; i < n; i++){
                calories[i] = scan.nextInt();
            }
            scan.close();
            System.out.println(minimumMiles(calories));
        }

        /* Uses Greedy Algorithm */
        private static long minimumMiles(Integer [] calories) {
            Arrays.sort(calories, Collections.reverseOrder());
            long multiplier = 1;
            long miles = 0;
            for (int j = 0; j < calories.length; j++) {
                miles += calories[j] * multiplier;
                multiplier *= 2;
            }
            return miles;
    }
}
