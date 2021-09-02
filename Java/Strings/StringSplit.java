import java.util.*;
public class StringSplit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String delemeter = sc.next();
        String[] splittedString = str.split(delemeter);
        for(String s : splittedString)    
            System.out.println(s);
        sc.close();
    }
}
