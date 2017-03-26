package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 26/03/17.
 */
public class SumArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++){
            result = result + arr[i];
        }
        System.out.println(result);
    }
}
