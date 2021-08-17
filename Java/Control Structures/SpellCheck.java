import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = ' ';
        boolean flag = true;
        System.out.print("Enter the first letter:");
        letter = sc.next().charAt(0);
        if (letter != 'R') {
            flag = false;
        }
        System.out.print("Enter the second letter:");
        letter = sc.next().charAt(0);
        if (letter != 'A') {
            flag = false;
        }
        System.out.print("Enter the third letter:");
        letter = sc.next().charAt(0);
        if (letter != 'I') {
            flag = false;
        }
        System.out.print("Enter the fourth letter:");
        letter = sc.next().charAt(0);
        if (letter != 'N') {
            flag = false;
        }
        System.out.print("Enter the fifth letter:");
        letter = sc.next().charAt(0);
        if (letter != 'B') {
            flag = false;
        }
        System.out.print("Enter the sixth letter:");
        letter = sc.next().charAt(0);
        if (letter != 'O') {
            flag = false;
        }
        System.out.print("Enter the seventh letter:");
        letter = sc.next().charAt(0);
        if (letter != 'W') {
            flag = false;
        }
        if (flag == true) {
            System.out.println("RAINBOW");
        }
        else{
            System.out.println("The Spelling is wrong");
        }
        sc.close();
    }
}
