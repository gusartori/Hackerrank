package challenges;

import java.util.Scanner;

/**
 * Created by Gustavo on 29/03/17.
 */
public class BonAppetit {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer [] dishes = new Integer[n];
        for (int i = 0; i < n; i++){
            dishes[i] = sc.nextInt();
        }
        int c = sc.nextInt();
        sc.close();
        int totalCost = 0;
        for (int i = 0; i < n; i++) {
            if(i!=k){
                totalCost = totalCost + dishes[i];
            }
        }
        System.out.println(totalCost);
        if(totalCost/2>=c){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(c - totalCost/2);
        }
    }
}
