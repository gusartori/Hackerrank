package challenges;

import java.util.*;

/**
 * Created by Gustavo on 29/03/17.
 */
public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Hashtable<Integer, Integer> typesHT = new Hashtable<>();
        for(int types_i=0; types_i < n; types_i++){
            int bird = in.nextInt();
            if(typesHT.get(bird)==null){
                typesHT.put(bird,1);
            } else {
                typesHT.replace(bird, typesHT.get(bird)+1);
            }
        }
        int mostBirds = 0;
        int answer = 0;
        for (Integer key: typesHT.keySet()){
            if(typesHT.get(key) > mostBirds){
                mostBirds = typesHT.get(key);
                answer = key;
            }
        }

        System.out.println(answer);

    }




}
