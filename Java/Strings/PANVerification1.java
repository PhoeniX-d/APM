import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PANVerifification1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PAN number");
        String panNumber = sc.nextLine();
        Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
        Matcher matcher = pattern.matcher(panNumber);
        if(matcher.matches())
            System.out.println("Valid PAN number");
        else
            System.out.println("Invalid PAN number");
        sc.close();
    }
}
