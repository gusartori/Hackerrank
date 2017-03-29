package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 28/03/17.
 */
public class ChessboardGame {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int x=in.nextInt();
            int y=in.nextInt();
            System.out.println(findWinner(x,y));
        }
    }

    public static String findWinner(int x, int y){
        x=x%4;
        y=y%4;
        if((y==0)||(y==3)||(x==0)||(x==3)) return "First";
        return "Second";
    }
}
