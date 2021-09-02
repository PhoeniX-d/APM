import java.util.*;
public class StringCompare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        if(first.equals(second))
            System.out.println("Case sensitive");
        else if(first.equalsIgnoreCase(second))
            System.out.println("Case insensitive");
        else
            System.out.println("Not equal");       
        sc.close();
    }
}
