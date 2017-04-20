package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 12/04/17.
 */
public class SparseArrays {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String [] array = new String[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.next();
        }
        int q = sc.nextInt();
        String [] queries = new String[n];
        for (int i = 0; i < q; i++){
            String query = sc.next();
            int repeat = 0;
            for (int j = 0; j < n; j++) {
                if(query.equals(array[j])){
                    repeat++;
                }
            }
            System.out.println(repeat);
        }
        sc.close();

    }
}
