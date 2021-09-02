import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class OccuranceOfChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inmate's name:");
        String name = sc.nextLine();
        System.out.println("Inmate's father's name:");
        String fatherName = sc.nextLine();
        Pattern p = Pattern.compile("^[a-zA-Z\\s]*$");
        Matcher m1 = p.matcher(name);
        Matcher m2 = p.matcher(fatherName);
        if(m1.matches() && m2.matches())
            System.out.println((name.toUpperCase().concat(" ")).concat(fatherName.toUpperCase()));
        else
            System.out.println("Invalid name");
        sc.close();
    }
}
