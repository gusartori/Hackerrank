package challenges;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Gustavo on 29/03/17.
 */
public class BigFatorials {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        BigInteger res = BigInteger.valueOf(n);
        for (int i = 1; i < n; i++) {
            res = res.multiply(BigInteger.valueOf(n-i));
        }
        System.out.println(res);
    }

}
