package challenges;

/**
 * Created by Gustavo on 24/03/17.
 */
public class Task3 {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==1){
            return -2;
        }
        int result =  Math.abs(A[0]-A[1]);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if(i==j){
                    continue;
                }
                int distance =  Math.abs(A[j]-A[i]);
                if(distance<result) {
                    result = distance;
                }
            }
        }
        if(result>100000000){
            return -1;
        }
        return result;
    }


    public static void main (String args[]){
        int[] A = {-2147483608, 2147483607};
        System.out.println(solution(A));
    }
}
