package challenges;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Gustavo on 28/03/17.
 */
public class PrimeNumberGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            boolean[] included = new boolean[n+1];
            HashSet<Integer> primeMap = new HashSet<Integer>();
            for(int i =2; i <= n; i++){
                if(!included[i]){
                    primeMap.add(i);
                    int multiples = i+ i;
                    while(multiples <=n){
                        included[multiples] = true;
                        multiples += i;
                    }
                }
            }

            if(primeMap.size() % 2 == 0) System.out.println("Bob");
            else System.out.println("Alice");
        }
        in.close();
    }
/*
    public static void printWinner(int turn){
        if (turn == 0) {

            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }

    public static ArrayList<Integer> fillArray (int n){
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(i);
        }
        return al;
    }

    public static int newTurn(ArrayList<Integer> al, int turn){
        int prime = choosePrime(al);
        System.out.println("Prime: "+prime);
        if (prime > 1){
            if (removeMultiples(prime, al)){
                return nextTurn(turn);

            }
        }
        return nextTurn(turn);
    }

    public static boolean removeMultiples(int prime, ArrayList<Integer> al){
        boolean removed = false;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)>=prime && al.get(i)%prime==0){
                al.remove(i);
                removed = true;
            }
        }
        return removed;
    }

    public static int nextTurn(int turn){
        if (turn==0){
            return turn =1;
        } else {
            return turn =0;
        }
    }

    public static int choosePrime (ArrayList<Integer> al){
        for (int i = 0; i < al.size(); i++) {
            if(isPrime(al.get(i))){
                return al.get(i);
            }
        }
        return 1;
    }

    public static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    */
}
