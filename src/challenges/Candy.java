package challenges;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Gustavo on 29/03/17.
 * Alice is a kindergarten teacher.
 * She wants to give some candies to the children in her class. All the children sit in a line ( their positions are fixed),
 * and each of them has a rating score according to his or her performance in the class.
 * Alice wants to give at least 1 candy to each child. If two children sit next to each other,
 * then the one with the higher rating must get more candies. Alice wants to save money,
 * so she needs to minimize the total number of candies given to the children.

 Input Format

 The first line of the input is an integer N, the number of children in Alice's class.
 Each of the following N lines contains an integer that indicates the rating of each child.

 3
 1 2 2
 */
public class Candy {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }
        scan.close();

        int count = n;
        int[] candies = new int[n];
        candies[0]=1;

        for (int i = 1; i < n; i++) {
            if(array[i]>array[i-1]){
                candies[i] = candies[i-1]+1;
            } else {
                candies[i] = 1;
            }
        }
        for (int i = array.length-2; i >= 0; i--) {
            if(array[i]>array[i+1]){
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        System.out.println(IntStream.of(candies).sum());
    }

}
