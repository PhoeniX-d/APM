import java.util.*;
public class StringContains{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String stringToBeSearched = sc.nextLine();
        if(string.contains(stringToBeSearched))
            System.out.println(stringToBeSearched + " is contained in a sentence");
        else
            System.out.println(stringToBeSearched + " is not contained in a sentence");
        sc.close();
    }
}
