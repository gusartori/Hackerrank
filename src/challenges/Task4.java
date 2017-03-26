package challenges;

/**
 * Created by Gustavo on 24/03/17.
 */
public class Task4 {

    public static void main (String args[]){
        int[] A = {2,2,2,2,1,2,-1,2,1,3};
        System.out.println("Solucao "+solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int sliceSize = 0;
        int maxSliceSize = -1;
        int p = 0;
        int lastValue = A[0];
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j < A.length; j++) {
                if(A[i]>=A[j] || A[j]<=lastValue) {
                    sliceSize = 0;
                    break;
                }
                lastValue=A[j];
                sliceSize++;
                if(maxSliceSize<sliceSize){
                    maxSliceSize = sliceSize;
                    p = i;
                }

            }
            continue;
            }

        return p;
    }

}
