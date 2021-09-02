import java.util.*;
public class CountAlphabets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int strLen = string.length();
        int alphabetCounts = 0;
        for(int i = 0; i < strLen; i++){
            if(Character.isAlphabetic(string.charAt(i)))
                alphabetCounts++;
        }
        System.out.println(alphabetCounts);
        sc.close();
    }
}
