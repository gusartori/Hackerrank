package challenges;

/**
 * Created by Gustavo on 24/03/17.
 */
public class Task2 {

    public static boolean solution(int[] A) {
        // write your code in Java SE 8
        int positionSwap = iterate(A);

        if(positionSwap==-1){
            return true;
        }

        int swapCandidate = findSwapCandidate(A, positionSwap);

        if(swapCandidate==-2){
            return false;
        } else {
            A = swap(A, positionSwap, swapCandidate);
        }

        positionSwap = iterate(A);

        if(positionSwap==-1){
            return true;
        } else {
            return false;
        }

    }

    public static int findSwapCandidate(int[] A, int positionSwap){
        int swapCandidate = -2;
        for (int j = positionSwap+1; j < A.length; j++) {
            if(A[positionSwap]>A[j]){
                swapCandidate = j;
            }
        }
        return swapCandidate;
    }

    public static int[] swap(int[] A, int positionSwap, int swapCandidate){
        int provData = A[positionSwap];
        A[positionSwap] = A[swapCandidate];
        A[swapCandidate] = provData;
        return A;
    }

    public static int iterate(int[] A){
        for (int i = 0; i <= A.length-2; i++) {
            if(A[i]<=A[i+1]){
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static void main (String args[]){
        int[] A = {1,3,5,3,4};
        System.out.println(solution(A));
    }
}
