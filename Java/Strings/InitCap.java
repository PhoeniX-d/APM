import java.util.*;

public class InitCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        char[] str = sc.nextLine().toCharArray();
        int uppercaseWords = 0, words = 0;
        int len = str.length;
        for (int i = 0; i < len; i++) {
            if (i == 0 || Character.isWhitespace(str[i - 1])) {
                words++;

                if (Character.isLowerCase(str[i])) {
                    str[i] = Character.toUpperCase(str[i]);
                } else {
                    uppercaseWords++;
                }
            }
        }
        if (words == uppercaseWords) {
            System.out.println("First character of each words is already in uppercase");
        }
        else {
            for (char i : str) {
                System.out.print(i);
            }
        }        
    }
}
