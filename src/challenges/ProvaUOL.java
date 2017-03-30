package challenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Gustavo on 30/03/17.
 */
public class ProvaUOL {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scan.nextInt();
        }
        System.out.println(countUmbrellas(p,n));
    }

    public static int countUmbrellas(int[] p, int people){
        int count = 0;
        int sum = sumArray(p, p.length);
        Arrays.sort(p);
        if(people>sum) {
            System.out.println(-1);
        } else {
            for (int j = p.length-1; j >= 0; j--) {
                people = people - p[j];
                if(people==0){
                    count++;
                    break;
                } else if (people>0 && people<=sumArray(p,j)){
                    count++;
                } else {
                    people = people + p[j];
                }
            }
        }
        if (people==0){
            return count;
        } else {
            return -1;
        }
    }

    public static int sumArray(int[] p, int length){
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + p[i];
        }
        return sum;
    }
}
