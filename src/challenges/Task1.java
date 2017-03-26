package challenges;

import java.util.Arrays;

/**
 * Created by Gustavo on 24/03/17.
 */
public class Task1 {

    public static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k])
            {i += 1; break;}
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

    public static void main(String[] args){
//            int[] A = {-1,3,-4,5,1,-6,2,1};
//        int[] A = {1,3,2,1};
//        int[] B = {2,2,3,4,5};


        int[] B = {5,6,7,8};
        int[] A = {1,1,5,5};
        System.out.println(solution(A,B));
    }
}


/*


import java.util.*;

class Solution {
    int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            while(i < m){
            if (A[k] == B[i])
                return A[k];
            i += 1;} i=0;
        }
        return -1;
    }
}    */