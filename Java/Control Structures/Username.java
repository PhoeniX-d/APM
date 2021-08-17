import java.util.Scanner;
public class Username{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "";
        System.out.println("Enter the name");
        username = sc.nextLine();
        System.out.println("Welcome " + username);
        sc.close();
    }
}
