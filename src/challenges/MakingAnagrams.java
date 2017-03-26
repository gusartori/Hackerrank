package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Gustavo on 23/03/17.
 */
public class MakingAnagrams {

    public static int numberNeeded(String first, String second) {
        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();

        int result = countList(firstArr, secondArr) +
                countList(secondArr, firstArr);

        return result;

    }

    public static int countList(char[] firstArr, char[] secondArr){
        List<String> firstList = new ArrayList<String>(firstArr.length);
        for(char c : firstArr){
            firstList.add(String.valueOf(c));
        }

        List<String> secondList = new ArrayList<String>(secondArr.length);
        for(char c : secondArr){
            secondList.add(String.valueOf(c));
        }
        firstList.forEach(x -> {
            if(secondList.contains(x)){
                secondList.remove(x);
            }
        });
        return secondList.size();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
