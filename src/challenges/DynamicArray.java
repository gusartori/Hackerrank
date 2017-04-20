package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Gustavo on 12/04/17.
 */
public class DynamicArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(new ArrayList<Integer>());
        }
        int lastAns = 0;
        while(q-->0){
            int query = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int index = (x ^ lastAns) % n;
            if(query==1){
                al.get(index).add(y);
            } else {
                lastAns = al.get(index).get(y % ( al.get(index).size()));
                System.out.println(lastAns);
            }
        }
    }
}
