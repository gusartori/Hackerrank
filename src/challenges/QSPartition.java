package challenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gustavo on 23/03/17.
 */
public class QSPartition {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();
            ArrayList<Integer> equal = new ArrayList<>();
            equal.add(a[0]);
            for (int i = 1; i < n; i++) {
                if (a[i]<equal.get(0)){
                    left.add(a[i]);
                } else {
                    if (a[i]>equal.get(0)){
                        right.add(a[i]);
                    } else {
                        equal.add(a[i]);
                    }
                }
            }
            System.out.println(print(left)+" "+print(equal)+" "+print(right));
        }

        public static String print(ArrayList<Integer> arr){
            String resp = "";
            for (int i = 0; i < arr.size(); i++) {
                if (i < arr.size()-1){
                    resp = resp + arr.get(i) + " ";
                } else {
                    resp = resp + arr.get(i);
                }
            }
            return resp;
        }
    }

