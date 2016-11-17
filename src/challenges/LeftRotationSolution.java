package challenges;

import java.util.Scanner;

public class LeftRotationSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int j = 0; j < k; j++){
            for(int a_i=0; a_i < n-1; a_i++){
                int c = a[a_i];
                a[a_i] = a[a_i+1];
                a[a_i+1] = c;
            }
        }
        for(int a_i=0; a_i < n; a_i++){
            System.out.print(a[a_i]+ " ");
        }
    }
}

