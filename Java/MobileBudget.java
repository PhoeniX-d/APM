import java.util.Scanner;

public class MobileBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of mobile");
        int cost = sc.nextInt();
        if (cost <= 13000) {
            System.out.println("Mobile chosen is within the budget");
        }
        else {
            System.out.println("Mobile chosen is beyond the budget");
        }
        sc.close();
    }
}