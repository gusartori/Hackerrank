package challenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Gustavo on 28/03/17.
 */
public class SquareRoot {

    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String line = br.readLine();
            int N = Integer.parseInt(line);

            double S = 3.0;
            double E = 5.0;

            double M = E-S;
            double medium = 0;
            double precision = Math.pow(10,-5);
            while (M>=precision) {
                medium = (M/2.0)+S;
                if (medium * medium > N) {
                    E = medium;
                } else {
                    S = medium;
                }
                M = E - S;
            }

            DecimalFormat df = new DecimalFormat("#.###");
            df.setRoundingMode(RoundingMode.UP);

            System.out.println(N+": "+df.format(medium));

        }
    }
}
