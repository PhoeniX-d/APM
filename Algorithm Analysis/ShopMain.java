import java.util.Scanner;

class ShopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of users:");
        int users = sc.nextInt();
        if (users <= 0 || users > 1000) {
            System.out.println("Invalid no. of users");
            sc.close();
            return;
        }
        int theStack[] = new int[users];
        int i = 0;
        for (i = 0; i < users; i++) {
            System.out.print("Enter the credit points for user " + (i + 1) + ": ");
            theStack[i] = sc.nextInt();
            if (theStack[i] < 0 || theStack[i] > 100)
                break;
        }
        if (i == users) {
            System.out.println("\nEnter the no. of users to serve: ");
            int usersToServe = sc.nextInt();
            if (usersToServe <= 0 || usersToServe > users) {
                System.out.println("Invalid no. of users");
                sc.close();
                return;
            }
            if (users == usersToServe)
                System.out.println("0 users to serve");
            else {
                System.out.println("The unserved user's credit points are:");
                for (i = usersToServe; i < users; i++)
                    System.out.print(" " + theStack[i]);
            }
        }
        sc.close();
    }
}
