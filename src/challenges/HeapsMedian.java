package challenges;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Gustavo on 27/03/17.
 */
public class HeapsMedian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        double[] medians = getMedians(a);
        for (int i = 0; i < medians.length; i++) {
            System.out.println(medians[i]);
        }
    }

    public static double[] getMedians(int[] arr){
        PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return -1 * a.compareTo(b);
            }
        });
        PriorityQueue<Integer> highers = new PriorityQueue<Integer>();

        double[] medians = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            addNumber(arr[i], lowers, highers);
            rebalance(lowers, highers);
            medians[i] = getMedian(lowers,highers);
        }
        return medians;
    }

    public static void addNumber (int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer>highers){
        if (lowers.size()==0 || number < lowers.peek()){
            lowers.add(number);
        } else {
            highers.add(number);
        }
    }

    public static void rebalance (PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
        PriorityQueue<Integer> biggerHeap = lowers.size()>highers.size()?lowers:highers;
        PriorityQueue<Integer> smallerHeap = lowers.size()>highers.size()?highers:lowers;

        if(biggerHeap.size()-smallerHeap.size()>=2){
            smallerHeap.add(biggerHeap.poll());
        }
    }

    public static double getMedian (PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
        PriorityQueue<Integer> biggerHeap = lowers.size()>highers.size()?lowers:highers;
        PriorityQueue<Integer> smallerHeap = lowers.size()>highers.size()?highers:lowers;

        if(biggerHeap.size()==smallerHeap.size()){
            return ((double)biggerHeap.peek() + smallerHeap.peek())/2;
        }else{
            return biggerHeap.peek();
        }
    }
}
