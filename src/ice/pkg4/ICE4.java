package ice.pkg4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cordelle Walden
 */
public class ICE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word and then character to count letters of");
        String word = sc.nextLine();
        char letter = sc.next().charAt(0);
        int count = charCount(word, letter);
        System.out.println(count);
        char[] list = new char[5];
        System.out.println("enter 5 chars");
        for(int i = 0; i < 5;i++){
            
            list[i] = sc.next().charAt(0);
        }
        sc.nextLine();
        char max = bigChar(list);
        System.out.println(max);
        System.out.println("Enter word and then character to check for");
        String word2 = sc.nextLine();
        char letter2 = sc.next().charAt(0);
        boolean check = checkChar(word2, letter2);
        System.out.println(check);
        
        
    }

    public static boolean checkChar(String word2, char letter2) {
        boolean check = false;
        for (int i = 0; i < word2.length(); i++) {
            if (letter2 == word2.charAt(i)) {
                check = true;
                
            }
        }
        return check;
    }

    public static char bigChar(char[] list) {
        char max = list[0];
        
        for(int i = 1; i < 5;i++){
            if (max < list[i]){
                max = list[i];
            }
        }
        return max;
    }

    public static int charCount(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length();i++  ){
            
            if (letter == word.charAt(i)){
                count++;
            }
        }
        return count;
    }

}
