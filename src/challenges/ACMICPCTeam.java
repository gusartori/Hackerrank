package challenges;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Gustavo on 29/03/17.
 */
public class ACMICPCTeam {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BigInteger[] perKnows = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            perKnows[i] = new BigInteger(sc.next(),2);
        }
        sc.close();
        int maxTopics = 0;
        int numberMT = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int test = perKnows[i].or(perKnows[j]).bitCount();
                if(test==maxTopics){
                    numberMT++;
                } else if(test > maxTopics){
                    maxTopics = test;
                    numberMT = 1;
                }
            }
        }

        System.out.println(maxTopics);
        System.out.println(numberMT);
    }
}
