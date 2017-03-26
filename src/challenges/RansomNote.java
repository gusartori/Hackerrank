package challenges;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by Gustavo on 23/03/17.
 */
public class RansomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        Hashtable hashMagazine= new Hashtable();

        for (int i = 0; i < magazine.length; i++) {
            hashMagazine.put(i, magazine[i]);
        }
        boolean validNote = true;
        for (int i = 0; i < ransom.length; i++) {
            if(!hashMagazine.contains(ransom[i])){
                validNote = false;
                break;
            } else {
                for (int j = 0; j < hashMagazine.size(); j++) {
                    if(hashMagazine.get(j)==ransom[i]){
                        hashMagazine.remove(j);
                        break;
                    }
                }
            }
        }
        if (validNote){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
