import java.util.Scanner;

public class ReplaceDriver {
    public static String replace(String str, char from, char to) {
        if (str.length() < 1) {
            return str;
        } else {
            char first = from == str.charAt(0) ? to : str.charAt(0);
            return first + replace(str.substring(1), from, to);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the string");
        str = sc.nextLine();
        System.out.println("Enter the character to be replaced");
        char from = sc.next().charAt(0);
        System.out.println("Enter the character to be replaced with");
        char to = sc.next().charAt(0);
        System.out.print("The modified string is " + replace(str, from, to));
        sc.close();
    }
}
