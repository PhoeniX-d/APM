import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word :");
        String word = sc.nextLine();
        int wordLen = word.length();

        if (word.matches("^[a-zA-Z]*$")) {
            int i = 0, j = wordLen - 1;
            while (i < j) {
                if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(j)))
                    break;
                i++;
                j--;
            }
            if (i >= j)
                System.out.println(word + " is a Palindrome");
            else
                System.out.println(word + " is not a Palindrome");
        } else
            System.out.println("Invalid Input");
    }
}
