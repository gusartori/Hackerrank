package challenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gustavo on 12/04/17.
 */
public class HourGlass {

    /*
    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 2 4 4 0
    0 0 0 2 0 0
    0 0 1 2 4 0
     */
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        int size = 6;

        int[][] array = new int[size][size];
        for(int i = 0; i<size;i++)
        {
            for (int j = 0; j < size; j++) {
                array[i][j]= scan.nextInt();
            }
        }
        scan.close();
        int sum = Integer.MIN_VALUE;
        if(size>3) {
            for (int i = 0; i <= size-3; i++) {
                for (int j = 0; j <= size - 3; j++) {
                    int hg = array[i][j] + array[i][j + 1] + array[i][j + 2]
                            + array[i + 1][j + 1]
                            + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                    if (hg > sum) {
                        sum = hg;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
