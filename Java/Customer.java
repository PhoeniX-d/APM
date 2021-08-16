import java.util.Scanner;
public class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter age:");
        int age = sc.nextInt();
        System.out.print("Enter gender:");
        String gender = sc.next();
        sc.nextLine();
        System.out.print("Hailing from:");
        String city = sc.nextLine();

        System.out.println("Welcome, " + name + "!");
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
        System.out.println("City:" + city);
        sc.close();   
    }
}
