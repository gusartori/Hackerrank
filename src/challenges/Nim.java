package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 28/03/17.
 */
public class Nim {


    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int g = s.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = s.nextInt();
            int temp, xor;
            xor = s.nextInt();
            for(int i = 1; i < n; i++){
                temp = s.nextInt();
                xor = xor^temp;
                System.out.println("xor :  "+xor);
            }
            if(xor == 0)
                System.out.println("Second");
            else
                System.out.println("First");
        }
    }


}
