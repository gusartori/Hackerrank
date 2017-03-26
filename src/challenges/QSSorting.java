package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Gustavo on 23/03/17.
 *
 * NAO FUNCIONA!!!
 */
public class QSSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int a[] = new int[n];
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int a_i = 0; a_i < n; a_i++) {
//            a[a_i] = in.nextInt();
            a.add(in.nextInt());
        }
        partition(a).forEach(x -> System.out.print(x+" "));
    }

    public static ArrayList partition (ArrayList<Integer> arr){
//        if (arr.size()<=1) {
//            return arr;
//        }
//        ArrayList<Integer> equal = new ArrayList<>();
        Integer pivot = arr.get(0);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
//        equal.add(pivot);
        arr.forEach(x -> {
            if(x<pivot){
                left.add(x);
            } else {
                if (x>pivot){
                    right.add(x);
                }
//                else {
//                    equal.add(x);
//                }
            }
        });
        ArrayList<Integer> resp = new ArrayList<>();
        if (left.size()>1){
            System.out.println(partition(left)+" "+pivot);
        } else {
            resp.add(0,left.get(0));
            resp.add(1,pivot);
            resp.forEach(x-> System.out.println(x+" "));
            return resp;
        }
        if (right.size()>1){
            partition(right);
        } else {
            resp.add(0,right.get(0));
            resp.add(1,pivot);
            resp.forEach(x-> System.out.println(x+" "));
            return resp;
        }
        return resp;
    }


}
