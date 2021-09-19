import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Customer[] cArr = new Customer[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the name:");
            String name = sc.nextLine();
            System.out.println("Enter the panno:");
            String pan = sc.nextLine();
            System.out.println("Enter the emailid:");
            String emailid = sc.nextLine();
            System.out.println("Enter the salary:");
            int sal = sc.nextInt();
            sc.nextLine();
            cArr[i] = new Customer(name, pan, emailid, sal);
        }
        if (cArr[0].equals(cArr[1]))
            System.out.println("Both the objects are equal.");
        else
            System.out.println("Both the objects are not equal.");
    }
}