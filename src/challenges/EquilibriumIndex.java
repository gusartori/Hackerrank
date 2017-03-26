package challenges;

/**
 * Created by Gustavo on 24/03/17.
 */
public class EquilibriumIndex {

        public static int solution(int[] A) {
            // write your code in Java SE 8
            if (A.length == 1){
                return 0;
            }
            for (int i = 0; i < A.length; i++) {

                int sumLeft = 0;
                int sumRight = 0;
                boolean sumDone = false;
                if(i>0){
                    for (int j = 0; j < i; j++) {
                        sumLeft = sumLeft + A[j];
                        sumDone = true;
                    }
                }
                for (int j = i+1; j < A.length; j++) {
                    sumRight = sumRight + A[j];
                    sumDone=true;
                }
                if (sumLeft == sumRight && sumDone){
                    return i;
                }
            }
            return -1;

        }

        public static void main(String[] args){
//            int[] A = {-1,3,-4,5,1,-6,2,1};
            int[] A = {1};
            System.out.println(solution(A));
        }

}
