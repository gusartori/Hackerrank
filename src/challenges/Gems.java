package challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Gustavo on 20/08/17.
 */
public class Gems {

    public static void main (String args []){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<Character> set = convertWordToSet(scan.next());
        for (int i = 1; i < n; i++){
            set.retainAll(convertWordToSet(scan.next()));
        }
        scan.close();
        System.out.println(set.size());

    }

    private static Set<Character> convertWordToSet(String word){
        Set<Character> set = new HashSet<>(26);
        for(char c:word.toCharArray()){
            set.add(Character.valueOf(c)    );
        }
        return set;
    }
}
