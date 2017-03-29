package challenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Gustavo on 28/03/17.
 */
public class SquareRoot {

//    public static void main (String args[]) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i < 4; i++) {
//            String line = br.readLine();
//
//            int N = Integer.parseInt(line);
//
//            System.out.format("%d%n", N);
//
//
//        }
//    }

    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String line = br.readLine();
            int N = Integer.parseInt(line);

            float S = 5.0f;
            float E = 25.0f;

            float M = E-S;
            float medium = 0f;
            double precision = Math.pow(10,-5);
            System.out.println(" precision:"+precision);
            while (M>=precision) {
                M = E - S;
                medium = (M/2.0f)+S;
                System.out.println("medium "+medium);
                if (M * M > N) {
                    E = M;
                } else {
                    S = M;
                }
            }

            DecimalFormat df = new DecimalFormat("#.####");
            df.setRoundingMode(RoundingMode.CEILING);

            System.out.println(N+": "+df.format(medium));

        }
    }
}
