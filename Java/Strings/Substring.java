import java.util.*;
public class Substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(string.substring(start, end));
        sc.close();
    }
}
