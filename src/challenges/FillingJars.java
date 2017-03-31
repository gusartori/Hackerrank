package challenges;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Gustavo on 31/03/17.
 */
public class FillingJars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        long total = 0;
        for(int i =0;i<m;i++){
            long i3=scan.nextInt();
            long i4=scan.nextInt();
            long i5=scan.nextInt();
            total += ((i4-i3)+1)*i5;
        }
        System.out.println(total/n);
    }
}

